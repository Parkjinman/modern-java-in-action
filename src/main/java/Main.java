import mordern.service.LambdaExpression;
import mordern.support.CommonUtils;

public class Main {

    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();
        CommonUtils commonUtils = new CommonUtils();

        System.out.println("start::::::");

//        lambdaExpression.lambda1();
        lambdaExpression.lambda2();

        commonUtils.fetch();

        System.out.println("end::::::");
    }

}
