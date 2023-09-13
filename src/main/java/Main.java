import mordern.Entity.Apple;
import mordern.Entity.Trader;
import mordern.Entity.Transaction;
import mordern.interfaces.ApplePredicate;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("start::::::");

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

        System.out.println("end::::::");
    }

}
