package mordern.support;

import mordern.Entity.Apple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SpringBootTest
class FilteringApplesTest {

    @Autowired
    private static FilteringApples filteringApples;

    private final List<Apple> inventory = Arrays.asList(
        new Apple(80, "green"),
        new Apple(155, "green"),
        new Apple(120, "red"),
        new Apple(151, "red")
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

//        System.out.println("isGreenApple = " + filteringApples.filterApples(inventory, (Apple a) -> "green".equals(a.getColor())));
//        System.out.println("isGreenApple = " + filter(inventory, (Apple a) -> "green".equals(a.getColor())));

//        List<Apple> redAndHeavyApples = FilteringApples.filterApples(inventory, new FilteringApples.AppleRedAndHeavyPredicate());
//        System.out.println("redAndHeavyApples : " + redAndHeavyApples);

        System.out.println(inventory);

//        inventory.sort(new Comparator<Apple>() {
//
//            @Override
//            public int compare(Apple a1, Apple a2) {
//                return a1.getWeight() - a2.getWeight();
//            }
//        });
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());

        System.out.println(inventory);

    }
}
