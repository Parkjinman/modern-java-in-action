import mordern.Entity.Apple;
import mordern.Entity.Trader;
import mordern.Entity.Transaction;
import mordern.interfaces.ApplePredicate;

import java.awt.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("start::::::");

        process(() -> System.out.println("Hello World 1"));

        System.out.println(fetch());

        System.out.println("end::::::");
    }

    private static void process(Runnable r) {
        r.run();
    }

    public static Callable<String> fetch() {
        return () -> "Tricky example ;-)";
    }


}
