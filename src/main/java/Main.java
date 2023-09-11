import mordern.Entity.Apple;
import mordern.support.CommonUtils;

import java.io.File;
import java.util.function.Predicate;

public class Main {

    private static CommonUtils commonUtils;

    public static void main(String[] args) {

        System.out.println("start::::::");

        Predicate<Integer> applePredicate = (num) -> num < 10;
        System.out.println(applePredicate);
        System.out.println(applePredicate.test(5));

        System.out.println("end::::::");
    }
}
