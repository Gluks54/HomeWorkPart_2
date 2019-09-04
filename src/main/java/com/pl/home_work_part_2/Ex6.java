import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
    //napisz funkcję, która przyjmie liste Integerów
    // i zwróci jeden string który składa się z wszystkich
    // liczb połączonych przecinkami.
    //   przykład:
    //       [1,2,10] -> "1,2,10"

    public static String fun (ArrayList< Integer> arrayList){

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(11);
        arrList.add(13);

         String temp = arrayList.stream()
                .map(x-> x.toString())
                .collect( Collectors.joining(","));
        return temp;
    }
}
