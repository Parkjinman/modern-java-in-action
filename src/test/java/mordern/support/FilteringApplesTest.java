package mordern.support;

import mordern.Entity.Apple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class FilteringApplesTest {

    @Autowired
    private static FilteringApples filteringApples;

    private final List<Apple> inventory = Arrays.asList(
        new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red")
    );

    @Test
    public void filterApples() throws Exception {
        //given

        //when
        List<Apple> apples = filteringApples.filterGreenApples(inventory);
        List<Apple> apples2 = filteringApples.filterHeavyApples(inventory);

        //then
        System.out.println("apples = " + apples);
        System.out.println("apples2 = " + apples2);
    }

    @Test
    public void filterApplesDistinct() throws Exception {
        //given

        //when

        //then
//        System.out.println("isGreenApple = " + filteringApples.filterApples(inventory, FilteringApples::isGreenApple));
//        System.out.println("isHeavyApple = " + filteringApples.filterApples(inventory, FilteringApples::isHeavyApple));

        System.out.println("isGreenApple = " + filteringApples.filterApples(inventory, (Apple a) -> "green".equals(a.getColor())));
//        System.out.println("isGreenApple = " + filter(inventory, (Apple a) -> "green".equals(a.getColor())));
    }
}
