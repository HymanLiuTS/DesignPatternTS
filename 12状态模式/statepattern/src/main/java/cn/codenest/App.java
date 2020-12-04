package cn.codenest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GumballMachine gumballMachine=new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.ejectQuarter();

        gumballMachine.turnCrank();

        final List<Integer> targets=new ArrayList<>();
        targets.add(1);

        // 创建一个延迟一次的单线程定时器
        ScheduledExecutorService pool = (ScheduledExecutorService) Executors.newSingleThreadScheduledExecutor();
        // 命令线程池开展任务调度。延迟1秒后执行参观任务
        pool.schedule(new Runnable() {

            @Override
            public void run() {
                Iterator it=targets.iterator();

            }
        }, 5, TimeUnit.SECONDS);

    }
}
