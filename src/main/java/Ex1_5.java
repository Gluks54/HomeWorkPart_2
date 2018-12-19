import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_5 {
    public static void main(String[] args) {
        //1. zwróć największą liczbę z listy intów.
        IntStream.range(1,10)
                .max()
                .ifPresent(System.out::print);

       //2. zwróć największą liczbę z listy Integerów.
        IntStream.range(1,10)
                .min()
                .ifPresent((x-> System.out.print(Integer.valueOf(x))));

        // 3 .zwróć średnią z listy intów
        IntStream.range(1,10)
                .average()
                .ifPresent(System.out::print);

        //4. zamień wszystkie Stringi w tablicy na wielkie litery

        Stream.of("a","b","c","g")
                .map(x->x.toUpperCase())
                .forEach(System.out::print);

        // 5. z listy stringów wybierz te które zaczynają się od 'a' i mają dokładnie 3 znaki
       Stream.of("adc","badaas","adfdc","errdsd")
               .filter(x-> x.length() == 3)
               .filter(x-> x.startsWith("a"))
               .forEach(System.out::print);
    }
}
