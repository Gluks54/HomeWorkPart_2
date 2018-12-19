import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex11 {
//Napisz funkcję która dostanie listę imion,
// każde imie zapisze wielkimi literami i zwróci
// tylko unikalne imiona.
//   Dodatkowo funkcja ma zwracać maksymalnie 10 imion
    public static Set<String> name(ArrayList<String> a){
        Set<String> temp =
                a.stream()
                .map(x->x.toUpperCase())
                .collect(Collectors.toSet());
        return temp;
    }
}
