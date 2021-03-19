import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeightSort {

    public static String orderWeight(String strng) {
        List<String> strarr= Stream.of(strng.split(" ")).collect(Collectors.toList());
        List<Integer> intArr = strarr.stream().map(Integer::parseInt).collect(Collectors.toList());

        char s = 's';
        System.out.println(intArr);

        /*Collections.sort(strarr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int i = (int) (Stream.of(o2.toCharArray())
                        .mapToInt(num -> Integer.valueOf((int) num - 44))
                        .sum()
                        - Stream.of(o1.toCharArray())
                        .mapToInt(num -> Integer.valueOf((int) num - 44))
                        .sum();
                return i;
            }
        });*/
        return String.join(" ", strarr);
    }
}