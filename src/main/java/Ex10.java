import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    //10 napisz funkcję która z podanych liczb
    // na wejściu zsumuje te które są większe od 10.
    public static int wen10 (ArrayList<Integer> a){
        int temp =
                a.stream()
                .filter(x-> x>10)
                        .mapToInt(x->x)
                        .sum();
        return temp;
    }
}
