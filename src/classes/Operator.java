package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Operator {

    public String firstTaskMethod(List<String> names){
        StringBuilder res = new StringBuilder();
        IntStream
                .range(1, names.size() + 1)
                .filter(s -> s % 2 != 0)
                .forEach(s -> res.append(s).append(". ").append(names.get(s - 1)).append(", "));
        return res.toString();
    }

    public List<String> secondTaskMethod(List<String> data){
        List<String> res;
        res = data.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
        return res;
    }

    public String thirdTaskMethod(List<Integer> data){
        StringBuilder res = new StringBuilder();
        data.stream()
                .sorted()
                .forEach(s -> res.append(s).append(", "));
        return res.toString();
    }

    public Stream<Long> fourthTaskMethod(long a, int c, long m ){
        long seed = 14;
        Stream<Long> res;
        res = Stream.iterate(seed,  n -> (a * n + c) % m)
                .limit(10);
        return res;
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        //Не впевнений що використання методу concat саме те, що потрібно
        //Stream<T> res = Stream.concat(first, second);

        Stream<T> res;
        StringBuilder sb = new StringBuilder();
        List<T> firstData = first.toList();
        List<T> secondData = second.toList();
        int size = Math.min(firstData.size(), secondData.size());
        IntStream
                .range(1, size + 1)
                .forEach(d -> sb.append(firstData.get(d - 1)).append(" ").append(secondData.get(d - 1)).append(" "));
        String[] arrRes = sb.toString().split(" ");
        return (Stream<T>) Stream.of(arrRes);
    }

}
