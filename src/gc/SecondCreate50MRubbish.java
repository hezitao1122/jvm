package gc;

/**
 * @author zeryts
 * @description:
    -XX:InitialHeapSize=209715200           初始堆内存的大小,这里给200M
    -XX:MaxHeapSize=2107044864              最大堆内存大小,这里给200M
    -XX:MaxNewSize=104857600               新生代最大大小,这里给100M
    -XX:MaxTenuringThreshold=15             表示对象被移到老年代的年龄阈值的最大值
    -XX:NewSize=104857600                   新生代初始值大小,这里给10M
    -XX:OldPLABSize=16                      老年代空间 PLAB 大小
    -XX:PretenureSizeThreshold=3145728      大对象的阈值,大于此对象的大小,直接分配到老年代
    -XX:+PrintGC                            打印GC参数
    -XX:+PrintGCDetails                     打印详细GC信息
    -XX:+PrintGCTimeStamps                  打印详细GC时间信息
    -XX:SurvivorRatio=8                     Eden区占新生代大小
    -XX:+UseCompressedClassPointers         类指针压缩
    -XX:+UseCompressedOops                  可以关闭压缩指针，对象头16字节(klass pointer 8字节)reference 8字节
    -XX:+UseConcMarkSweepGC                 使用CMS垃圾回收期
    -XX:-UseLargePagesIndividualAllocation
    -XX:+UseParNewGC                        新生代用ParNew垃圾回收
 * -----------------------------------
 * @title: SecondCreate50MRubbish 模拟每秒钟产生50M的垃圾
 * @date 2020/12/17 10:35
 * @result:
 * 4.651: [GC (Allocation Failure) 4.652: [ParNew: 81315K->1747K(92160K), 0.0009376 secs] 81315K->1747K(194560K), 0.0026854 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * Heap
 *  par new generation   total 92160K, used 31394K [0x0000000082600000, 0x0000000088a00000, 0x0000000088a00000)
 *   eden space 81920K,  36% used [0x0000000082600000, 0x00000000842f3c90, 0x0000000087600000)
 *   from space 10240K,  17% used [0x0000000088000000, 0x00000000881b4d08, 0x0000000088a00000)
 *   to   space 10240K,   0% used [0x0000000087600000, 0x0000000087600000, 0x0000000088000000)
 *  concurrent mark-sweep generation total 102400K, used 0K [0x0000000088a00000, 0x000000008ee00000, 0x0000000100000000)
 *  Metaspace       used 3119K, capacity 4556K, committed 4864K, reserved 1056768K
 *   class space    used 333K, capacity 392K, committed 512K, reserved 1048576K
 * @结果分析:
 * 1. 第一秒产生了50个1M的对象,此时Eden区有50个对象 此时Eden区占用59393K  72% 60个对象是69633K 85  70个对象是79873K 97%
 *      1个对象的时候是9216K  故不知用途的对象大概需要占8000K左右
 * 2. 第二秒当产生到72 个对象的时候,Eden区放不下了,故会触发一次垃圾回收
 * 3. 此时有一个引用还存活,故一个survivor有一个1M对象+700kb左右未知对象
 * 4. Eden区清空
 * 5. Metaspace方法区元数据,基于操作系统用户内存native 使用3119k
 * 6.class space 类信息元数据 基于操作系统内存
 */
public class SecondCreate50MRubbish {

    public static void main(String [] args) throws Exception{
        for (int i = 0; i < 10; i++){
            loadData();
        }
        Thread.sleep(1000);
    }

    public static void loadData() throws Exception{
        byte [] arr1 = null ;
        for (int i = 0; i < 50; i++) {
            arr1 = new byte[1024 * 1024];
        }
        arr1 = null;
        Thread.sleep(1000);
    }

}