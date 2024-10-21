import mordern.service.LambdaExpression;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();

        System.out.println("start::::::");

//        lambdaExpression.lambda1();
        lambdaExpression.lambda2();

        System.out.println(fetch());

        System.out.println("end::::::");
    }

    public static Callable<String> fetch() {
        return () -> "Tricky example ;-)";
    }

}
