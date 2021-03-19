import java.lang.reflect.Array;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Main {



    public static void main(String[] args){
        /*
        Intermediate operations
        Operation Type Return type Argument of the operation Function descriptor
        filter Intermediate Stream<T> Predicate<T> T -> boolean
        map Intermediate Stream<R> Function<T, R> T -> R
        limit Intermediate Stream<T>
        sorted Intermediate Stream<T> Comparator<T> (T, T) -> int
        distinct Intermediate Stream<T>
        skip

        Terminal operations

        Operation Type Purpose
        forEach Terminal Consumes each element from a stream and applies a lambda to each of
        them. The operation returns void.
                count Terminal Returns the number of elements in a stream. The operation returns a long.
                collect Terminal Reduces the stream to create a collection such as a List, a Map, or even

        List<Dish> dishes = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(toList());

                Optional<Transaction> smallestTransaction =
                 transactions.stream()
                    .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);

                */


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
