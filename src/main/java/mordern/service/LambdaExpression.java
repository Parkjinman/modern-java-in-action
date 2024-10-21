package mordern.service;

import mordern.support.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LambdaExpression {

    @Autowired
    private CommonUtils commonUtils;

    /**
     * 람다식을 이용한 Runnable 구현
     * 익명 클래스를 이용한 Runnable 구현
     * 서로 비교
     */
    public void lambda1() {
        // 람다식을 이용한 Runnable 구현
        // 한 개의 void 메서드를 가지고 있는 인터페이스를 구현하는 경우 중괄호 없이 사용 가능
        Runnable r1 = () -> System.out.println("Hello World 1");

        // 람다식을 이용한 Runnable 구현
        // 여러개의 메서드를 가지고 있는 인터페이스를 구현하는 경우 중괄호 사용
        Runnable r2 = () -> {
            System.out.println("Hello World 2");
            System.out.println("Hello World 2");
        };

        // 익명 클래스를 이용한 Runnable 구현
        Runnable r3 = new Runnable() {
            public void run() {
                System.out.println("Hello World 3");
            }
        };

        commonUtils.process(r1);
        commonUtils.process(r2);
        commonUtils.process(r3);
    }

    public void lambda2() {
        commonUtils.excute(() -> {});
    }

}
