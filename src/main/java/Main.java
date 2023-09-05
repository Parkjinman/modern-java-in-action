import mordern.support.CommonUtils;

import java.io.File;

public class Main {

    private static CommonUtils commonUtils;

    public static void main(String[] args) {

        System.out.println("start::::::");

        File[] hiddenFiles = commonUtils.getHiddenFiles();
        File[] hiddenFiles2 = commonUtils.getHiddenFiles2();

        System.out.println(hiddenFiles);
        System.out.println(hiddenFiles2);
        System.out.println(hiddenFiles.equals(hiddenFiles2));

        System.out.println("end::::::");
    }
}
