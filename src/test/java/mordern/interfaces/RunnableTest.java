package mordern.interfaces;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
}
