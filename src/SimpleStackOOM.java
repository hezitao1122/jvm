/**
 * @author zeryts
 * @description: 最简单的栈溢出的测试-递归
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
    -Xss1M || -Xss10M


    栈为1M的时候,大小为 11422
    栈为10M的时候,大小为 99512  配置高,数值就会高一些
 * -----------------------------------
 * @title: StackOOM
 * @projectName test-jvm
 * @date 2020/12/19 19:42
 */
public class SimpleStackOOM {

    public static void main(String[] args) {
        add(0);
    }
    private static void add(int a){
        a ++;
        System.out.println(a);
        add(a);
    }
}
