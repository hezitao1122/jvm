/**
 * @author zeryts
 * @description: 动态判断年龄进入老年代
    -XX:InitialHeapSize=104857600
    -XX:MaxHeapSize=104857600
    -XX:MaxNewSize=52428800
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
 * -----------------------------------
 * @title: DynamicAgeJudgeInOld
 * @projectName test-jvm
 * @date 2020/12/19 17:15
 */
public class DynamicAgeJudgeInOld {
    public static void main(String[] args) {
        byte [] arr2 = null;
        byte [] arr1 = new byte[1 * 1024 * 1024];
        for (int i = 0; i < 40*16; i++) {
            arr2 = new byte[1 * 1024 * 1024];
            arr2 = null;
        }
        /*
                    Heap
         par new generation   total 46080K, used 24013K [0x00000000f9c00000, 0x00000000fce00000, 0x00000000fce00000)
          eden space 40960K,  53% used [0x00000000f9c00000, 0x00000000fb195b78, 0x00000000fc400000)
          from space 5120K,  37% used [0x00000000fc900000, 0x00000000fcaddbe0, 0x00000000fce00000)
          to   space 5120K,   0% used [0x00000000fc400000, 0x00000000fc400000, 0x00000000fc900000)
         concurrent mark-sweep generation total 51200K, used 0K [0x00000000fce00000, 0x0000000100000000, 0x0000000100000000)
         Metaspace       used 3281K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 359K, capacity 388K, committed 512K, reserved 1048576K
           这是第十四次GC的数据,代表第十四次GC的时候,上面那1M对象还未进入老年代

           Heap
         par new generation   total 46080K, used 23126K [0x00000000f9c00000, 0x00000000fce00000, 0x00000000fce00000)
          eden space 40960K,  56% used [0x00000000f9c00000, 0x00000000fb295b98, 0x00000000fc400000)
          from space 5120K,   0% used [0x00000000fc400000, 0x00000000fc400000, 0x00000000fc900000)
          to   space 5120K,   0% used [0x00000000fc900000, 0x00000000fc900000, 0x00000000fce00000)
         concurrent mark-sweep generation total 51200K, used 1680K [0x00000000fce00000, 0x0000000100000000, 0x0000000100000000)
         Metaspace       used 3282K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 359K, capacity 388K, committed 512K, reserved 1048576K
           这是第十五次的GC数据,代表1M对象+512KB的对象是进入了老年代的
         */
    }
}
