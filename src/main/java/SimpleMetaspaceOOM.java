import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zeryts
 * @description: 永久带Medaspace溢出
    -XX:InitialHeapSize=314572800
    -XX:MaxHeapSize=314572800
    -XX:MaxNewSize=104857600
    -XX:MaxTenuringThreshold=15
    -XX:NewSize=52428800
    -XX:OldPLABSize=16
    -XX:PretenureSizeThreshold=31457280
    -XX:+PrintGC
    -XX:+PrintGCDetails
    -XX:+PrintGCTimeStamps
    -XX:SurvivorRatio=8
    -XX:+UseCompressedClassPointers
    -XX:+UseCompressedOops
    -XX:+UseConcMarkSweepGC
    -XX:-UseLargePagesIndividualAllocation
    -XX:+UseParNewGC
    -XX:MetaspaceSize=10485760
    -XX:MaxMetaspaceSize=10485760
 * -----------------------------------
 * @title: SimpleMetaspaceOOM
 * @projectName test-jvm
 * @date 2020/12/20 8:17
 */
public class SimpleMetaspaceOOM {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            count ++ ;
            System.out.println(count);
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(CglibProxy.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    if(method.getName().equals("run")){
                        System.out.println("启动!!");
                        return methodProxy.invokeSuper(o,objects);
                    }else{
                        return methodProxy.invokeSuper(o,objects);
                    }
                }
            });
            CglibProxy pro = (CglibProxy)enhancer.create();
            pro.run();
        }
        /*
        Heap
         par new generation   total 92160K, used 3262K [0x00000000ed400000, 0x00000000f3800000, 0x00000000f3800000)
          eden space 81920K,   3% used [0x00000000ed400000, 0x00000000ed72fb10, 0x00000000f2400000)
          from space 10240K,   0% used [0x00000000f2400000, 0x00000000f2400000, 0x00000000f2e00000)
          to   space 10240K,   0% used [0x00000000f2e00000, 0x00000000f2e00000, 0x00000000f3800000)
         concurrent mark-sweep generation total 204800K, used 1414K [0x00000000f3800000, 0x0000000100000000, 0x0000000100000000)
         Metaspace       used 9213K, capacity 10134K, committed 10240K, reserved 1058816K
          class space    used 793K, capacity 841K, committed 896K, reserved 1048576K

        10M的Metaspace空间,大概能走251次

           Heap
             par new generation   total 92160K, used 3265K [0x00000000ed400000, 0x00000000f3800000, 0x00000000f3800000)
              eden space 81920K,   3% used [0x00000000ed400000, 0x00000000ed730560, 0x00000000f2400000)
              from space 10240K,   0% used [0x00000000f2400000, 0x00000000f2400000, 0x00000000f2e00000)
              to   space 10240K,   0% used [0x00000000f2e00000, 0x00000000f2e00000, 0x00000000f3800000)
             concurrent mark-sweep generation total 204800K, used 4511K [0x00000000f3800000, 0x0000000100000000, 0x0000000100000000)
             Metaspace       used 29682K, capacity 30550K, committed 30720K, reserved 1077248K
              class space    used 2288K, capacity 2313K, committed 2432K, reserved 1048576K
        30M的metaspace空间,大概能走1441次

         */
    }


    static class CglibProxy {
        public void run() {
            System.out.println("run  开始运行 ........ ");
        }
    }
}