package mordern.interfaces;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RunnableTest {

    @Test
    public void threadTest() throws Exception {
        //given
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello ");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("world"));

        t1.start();
        t2.start();
        t1.join();

        //when

        //then
    }

    @Test
    public void threadTest2() throws Exception {
        //given
        Thread thread1 = new Thread(() -> {
            System.out.println("쓰레드 1 시작");
            try {
                Thread.sleep(2000); // 2초 동안 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("쓰레드 1 종료");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("쓰레드 2 시작");
            try {
                Thread.sleep(1000); // 1초 동안 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("쓰레드 2 종료");
        });

        thread1.start();
        thread2.start();

        // thread1이 종료될 때까지 대기
        thread2.join();

        System.out.println("메인 쓰레드 종료");
        //when

        //then
    }

    @Test
    public void threadTest3() throws Exception {
        //given
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        System.out.println(threadName);

        executorService.shutdown();

        Future<String> threadName2 = executorService.submit(() -> Thread.currentThread().getName());
        System.out.println("threadName2" + threadName2);

        executorService.shutdown();
        //when

        //then
    }
}
