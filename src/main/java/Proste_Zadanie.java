import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Proste_Zadanie {
    public static void main(String[] args) {
        //1
//        IntStream.range(1,10)
//                .max()
//                .ifPresent(System.out::print);




       // zwróć największą liczbę z listy Integerów.
//        IntStream.range(1,10)
//                .min()
//                .ifPresent((x-> System.out.print(Integer.valueOf(x))));

        //zwróć średnią z listy intów
//        IntStream.range(1,10)
//                .average()
//                .ifPresent(System.out::print);

       //zamień wszystkie Stringi w tablicy na wielkie litery

//        Stream.of("a","b","c","g")
//                .map(x->x.toUpperCase())
//                .forEach(System.out::print);

//        z listy stringów wybierz te które zaczynają się od 'a' i mają dokładnie 3 znaki
//       Stream.of("adc","badaas","adfdc","errdsd")
//               .filter(x-> x.length() == 3)
//               .filter(x-> x.startsWith("a"))
//               .forEach(System.out::print);

//        ArrayList<Integer> arrList = new ArrayList<>();
//        arrList.add(1);
//        arrList.add(2);
//        arrList.add(11);
//        arrList.add(13);

        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("amy");
        arrString.add("kally");
        arrString.add("vicey");
        arrString.add("dfdf");
        arrString.add("amy");
        arrString.add("kally");
        arrString.add("vicey");
        arrString.add("dfdf");
        arrString.add("amy");
        arrString.add("kally");
        arrString.add("vicey");
        arrString.add("dfdf");

//           List<Integer> temp =  Ex9.padzel(arrList);
//        System.out.println(temp);
//            int temp = Ex10.wen10();
//        System.out.println(temp);

        Set<String> ser = Ex11.name(arrString);
        System.out.println(ser);
//        String common = Ex_6Proste_Zad.fun(arrList);
//        String temp = Ex8.tyl(arrList);
//        System.out.println(temp);

//


//        Arrays.stream(new int []{1,2,3,})
//
//                .mapToObj(x -> Integer.valueOf(x))
//                .min()
//                .get()
//
//                .isPresent(System.out::print);



    }



}
