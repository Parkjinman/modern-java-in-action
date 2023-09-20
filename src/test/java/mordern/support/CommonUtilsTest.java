package mordern.support;

import org.assertj.core.api.filter.Filters;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class CommonUtilsTest {

    @Autowired
    private static CommonUtils commonUtils;

    @Test
    public void getHiddenFiles() throws Exception {
        //given
        commonUtils = new CommonUtils();

        //when
        File[] hiddenFiles = commonUtils.getHiddenFiles();
        File[] hiddenFiles2 = commonUtils.getHiddenFiles2();

        //then
        assertThat(hiddenFiles).isEqualTo(hiddenFiles2);
    }

    @Test
    public void testLamda() throws Exception {
        //given
        commonUtils = new CommonUtils();

        //when

        //then
        commonUtils.process(() -> System.out.println("Hello World 1"));
        System.out.println(commonUtils.fetch().call());
    }

    @Test
    public void testLamda2() throws Exception {
        List<String> listOfStrings = new ArrayList<>();
        //given
        List<String> nonEmpty = commonUtils.filter(listOfStrings, (String s) -> !s.isEmpty());

        for (String str : nonEmpty) {
            System.out.println(str);
        }

        //when

        //then
    }

}
