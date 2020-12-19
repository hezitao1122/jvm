import java.util.ArrayList;
import java.util.List;

/**
 * @author zeryts
 * @description: 最简单的堆内内存溢出
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
    -XX:+HeapDumpOnOutOfMemoryError
    -XX:HeapDumpPath=D:\projects\test-jvm\out
 * -----------------------------------
 * @title: SimpleDumpOOM
 * @projectName test-jvm
 * @date 2020/12/19 20:07
 *
 */
public class SimpleDumpOOM {

    private static List<byte[]> list = new ArrayList();

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            byte [] arr = new byte[1024*1024];
            System.out.println(i);
            list.add(arr);
        }
        /*
        Heap
         par new generation   total 92160K, used 91136K [0x00000000ed400000, 0x00000000f3800000, 0x00000000f3800000)
          eden space 81920K, 100% used [0x00000000ed400000, 0x00000000f2400000, 0x00000000f2400000)
          from space 10240K,  90% used [0x00000000f2400000, 0x00000000f2d00090, 0x00000000f2e00000)
          to   space 10240K,   0% used [0x00000000f2e00000, 0x00000000f2e00000, 0x00000000f3800000)
         concurrent mark-sweep generation total 204800K, used 204401K [0x00000000f3800000, 0x0000000100000000, 0x0000000100000000)
         Metaspace       used 3345K, capacity 4496K, committed 4864K, reserved 1056768K
          class space    used 362K, capacity 388K, committed 512K, reserved 1048576K
            分析: 能执行到286个
            Eden区满了
            一个survivor区也满了
            old区也满了
            通过MAT分析 有大概287个对象,占用300,945,904 byte

         */
    }
}
