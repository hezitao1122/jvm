比较通用的模板
    以4核8G机器为例子  
    '-Xms4096M  
    -Xmx4096M  
    -Xmn3072M  
    -Xss1M  
    -XX:MetaspaceSize=256M  
    -XX:MaxMetaspaceSize=256M  
    -XX:+UseParNewGC  
    -XX:+UseConcMarkSweepGC  
    -XX:CMSInitiatingOccupancyFaction=92  
    -XX:+useCMSCompactAtFullCollection  
    -XX:CMSFullGCsBeforeCompaction=0  
    -XX:+CMSParallellnitialMarkEnable  
    -XX:+CMSScavengeBeforeRemark  
    -XX:+DisableExplicitGC  
    -XX:+PrintGCDetails  
    -Xloggc:gc.log  
    -XX:+HeapDumOnOutOfMemoryError  
    -XX:HeapDumpPath=/usr/local/app/oom'