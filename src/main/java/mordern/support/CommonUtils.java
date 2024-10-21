package mordern.support;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Component
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

    public static void process(Runnable r) {
        r.run();
    }

    public static void excute(Runnable r) {
        r.run();
    }

    public static Callable<String> fetch() {
        return () -> "Tricky example ;-)";
    }

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    public <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t: list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
