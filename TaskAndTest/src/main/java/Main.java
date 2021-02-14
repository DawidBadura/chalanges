import java.lang.reflect.Array;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {



    public static void main(String[] args){
//streams and lambda expresions
        //quiz 5.2
        //1
        List<Integer>numbers =  Arrays.asList(1,2,3,4,5);
        List<Integer>squares = numbers.stream()
                .map(n -> n*n)
                .collect(toList());
        //2
        List<Integer>numbers1 = Arrays.asList(1,2,3);
        List<Integer>numbers2 = Arrays.asList(3,4);
        List<int[]>pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                .map(j -> new int[]{i, j}))
                .collect(toList());
        //3
        List<int[]>pairsDivBy3 = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (j+i)%3==0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());
        pairsDivBy3.stream().forEach(ints -> System.out.println(ints[0]+" "+ints[1]));


    }
}
