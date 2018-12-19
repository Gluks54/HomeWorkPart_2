import java.util.LinkedList;
import java.util.stream.Collectors;

public class Ex8 {
    // napisz funkcję która zwróci wyraz podany na wejściu od tyłu.
    public static String tyl(String a) {
        StringBuilder stringBuilder = new StringBuilder(a);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}


