import classes.Operator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Dispatcher {
    public static void main(String[] args) {
        Operator op = new Operator();
        List<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Amelia");
        names.add("James");
        names.add("Benjamin");
        names.add("Sophia");
        names.add("Theodore");
        names.add("Isabella");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        numbers.add(4);

        System.out.println();
        System.out.println(op.firstTaskMethod(names));
        System.out.println();
        System.out.println(op.secondTaskMethod(names));
        System.out.println();
        System.out.println(op.thirdTaskMethod(numbers));
        System.out.println();

        //Метод викликає безкінечну генерацію випадкових чисел, тому за замочуванням стоїть обмеження на 10 чисел
        op.fourthTaskMethod(25214903917L, 11, (long)Math.pow(2, 48)).forEach(System.out::println);
        System.out.println();

        Operator.zip(Stream.of(names.toArray()), Stream.of(numbers.toArray())).forEach(s -> System.out.print(s + " "));
    }
}
