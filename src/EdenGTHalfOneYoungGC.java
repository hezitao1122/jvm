/**
 * @author zeryts
 * @description: 测试survivor区,超过一半,会有多少对象进入老年代
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
 * @title: EdenGtHalfOneYoungGC
 * @projectName test-jvm
 * @date 2020/12/19 16:51
 */
public class EdenGTHalfOneYoungGC {
    public static void main(String[] args) throws InterruptedException {
        byte [] arr1 = new byte[10* 1024 * 1024];
        byte [] arr2 = new byte[20 * 1024 * 1024];
        byte [] arr3 = new byte[ 1024 * 1024];
        arr1 = null;
        arr2 = null;
        //此处GC  然后arr3 进survivor区 arr4 在Eden区  此时Eden区有10M
        byte [] arr4 = new byte[10 *1024 * 1024];
        //此时arr5 进Eden区   Eden区有 16M 其中arr4成垃圾
        byte [] arr5 = new byte[6 * 1024 * 1024];
        arr4 = null;
        arr4 =  new byte[10 * 1024 * 1024];
        arr4 =  new byte[10 * 1024 * 1024];
        //此时 Eden区大概有36M对象,survivor区有个1M的对象,再往下执行,会进行YoungGC
        arr4 =  new byte[10 * 1024 * 1024];
        /*
         *  par new generation   total 46080K, used 15756K [0x00000000f9c00000, 0x00000000fce00000, 0x00000000fce00000)
         *   eden space 40960K,  33% used [0x00000000f9c00000, 0x00000000fa97a2a8, 0x00000000fc400000)
         *   from space 5120K,  38% used [0x00000000fc400000, 0x00000000fc5e9138, 0x00000000fc900000)
         *   to   space 5120K,   0% used [0x00000000fc900000, 0x00000000fc900000, 0x00000000fce00000)
         *  concurrent mark-sweep generation total 51200K, used 16386K [0x00000000fce00000, 0x0000000100000000, 0x0000000100000000)
         *  Metaspace       used 3787K, capacity 4536K, committed 4864K, reserved 1056768K
         *
         * 这个是上行代码执行的结果,即 , 执行完上一行代码后,
         * Eden区存活对象为 arr4的10M + arr5的6M,这两个对象很明显不能进survivor区,故一次GC后直接进入了老年代
         * survivor区的存活对象为 arr3的1M
         */
        arr4 = null;
        Thread.sleep(1000);
    }
}
