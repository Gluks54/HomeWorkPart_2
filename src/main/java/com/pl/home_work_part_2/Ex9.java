import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    //napisz funkcję
    // która z listy intów wybierze
    // tyle te które są podzielne przez 3.

    public static List<Integer> padzel(ArrayList<Integer> a){
          List <Integer> temp = a.stream()
                .filter(x-> x%3 == 0)
                .collect(Collectors.toList());
        return temp;
    }
}
