package singleton

import java.util.concurrent.Callable
import java.util.concurrent.FutureTask

/**
 * @Author:夏立学
 * @ClassName:StatrtDemo
 * @Date:2020 /1/15/10:49
 * @Comment 启动测试类
 */
class StatrtDemo implements Callable{

    static void main(String[] args) {
        Callable<Integer> callable = new StatrtDemo()
        FutureTask<Integer> futureTask = new FutureTask(callable)
        Thread thread1 = new Thread(futureTask)
        Thread thread2 = new Thread(futureTask)
        thread1.start()
        thread2.start()
        println futureTask.get()
    }

    @Override
    Object call() throws Exception {
        return '创建实例次数:'+Singtelon1.getSingtelonObject().num
    }
}
