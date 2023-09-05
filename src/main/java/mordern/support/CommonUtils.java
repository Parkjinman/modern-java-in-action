package mordern.support;

import java.io.File;
import java.io.FileFilter;


public class CommonUtils {

    public static File[] getHiddenFiles() {
        return new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
    }

    public static File[] getHiddenFiles2() {
        return new File(".").listFiles(File::isHidden);
    }
}
