import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ex7 {
    //7. do funkcji z zadania 6
    // dodaj rozpoznawanie czy liczba jest parzysta czy
    // nieparzysta. Jeżeli liczba jest parzysta poprzedz
    // ja "e", jeżeli jest nieparzysta poprzedź ja "o".
    //   przykład:  [1,2,10] -> "o1,e2,e10"

    public static String funParz (ArrayList< Integer> arrayList){

        String temp = arrayList
                .stream()
                .map((x)-> {
                            if (x % 2 != 0) {
                                return  "e" + x.toString();
                            }else{
                                return "o" + x.toString();
                            }
                        })
                .collect( Collectors.joining(","));
        return temp;
    }
}
