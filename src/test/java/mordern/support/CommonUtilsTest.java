package mordern.support;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

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

}
