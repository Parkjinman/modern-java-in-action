package modernjavainaction.chap03;

import java.util.ArrayList;
import java.util.List;

public class PredicateMain {

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

    public static void main(String[] args) {
        PredicateMain predicateMain = new PredicateMain();
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("c");
        listOfStrings.add("");
        listOfStrings.add("b");
        listOfStrings.add("");
        listOfStrings.add("a");

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = predicateMain.filter(listOfStrings, nonEmptyStringPredicate);

        System.out.println(nonEmpty);
    }

}
