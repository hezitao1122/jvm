package gc;

/**
 * @author zeryts
 * @description: 一次YoungGC  新生代给5M,老年代5M 堆一共10M
    -XX:InitialHeapSize=10485760
    -XX:MaxHeapSize=10485760
    -XX:MaxNewSize=5242880
    -XX:MaxTenuringThreshold=15
    -XX:NewSize=5242880
    -XX:OldPLABSize=16
    -XX:PretenureSizeThreshold=3145728
    -XX:+PrintGC -XX:+PrintGCDetails
    -XX:+PrintGCTimeStamps
    -XX:SurvivorRatio=8
    -XX:+UseCompressedClassPointers
    -XX:+UseCompressedOops
    -XX:+UseConcMarkSweepGC
    -XX:-UseLargePagesIndividualAllocation
    -XX:+UseParNewGC
 * -----------------------------------
 * @title: OneYoungGC
 * @projectName test-jvm
 * @date 2020/12/17 14:35
 * @result:  ParNew发生一次辣鸡回收
 * 0.147: [GC (Allocation Failure) 0.148: [ParNew: 4070K->512K(4608K), 0.0027037 secs] 4070K->762K(9728K), 0.0046881 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
 * Heap
 *  par new generation   total 4608K, used 3628K [0x0000000082600000, 0x0000000082b00000, 0x0000000082b00000)
 *   eden space 4096K,  76% used [0x0000000082600000, 0x000000008290b228, 0x0000000082a00000)
 *   from space 512K, 100% used [0x0000000082a80000, 0x0000000082b00000, 0x0000000082b00000)
 *   to   space 512K,   0% used [0x0000000082a00000, 0x0000000082a00000, 0x0000000082a80000)
 *  concurrent mark-sweep generation total 5120K, used 250K [0x0000000082b00000, 0x0000000083000000, 0x0000000100000000)
 *  Metaspace       used 3786K, capacity 4536K, committed 4864K, reserved 1056768K
 *   class space    used 420K, capacity 428K, committed 512K, reserved 1048576K
 *  分析:
 *      1.Eden区大小为4M , 首先在Eden区分配一个2M空间,然后再往Eden区放128k
 *      2.当再往Eden区放一个2M对象时,放不下了,需要进行GC  此时上一个2M对象引用丢失
 *
 *
 */
public class OneYoungGC {
    public static void main(String[] args) throws InterruptedException {
        byte [] arr1 = new byte[2 * 1024 * 1024];
        arr1 = null;
        byte [] arr2 = new byte[128 * 1024];
        arr1 = new byte[2 * 1024 * 1024];
        Thread.sleep(1000);
    }
}
