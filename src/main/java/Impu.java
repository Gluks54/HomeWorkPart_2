import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Impu {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
//        for (String line :
//                lines) {
//            System.out.println(line);
//        }
        List<String> models = lines.subList(1, lines.size());
        //System.out.println(models);



        List<Car> cars = models
                .stream()
                .map(x -> {
                    String[] splitted = x.split(",");
                    Car car = new Car();
                    car.division = splitted[0];
                    return car;
                })
                .collect(Collectors.toList());
        System.out.println(cars);


//        List<Car> cars = models
//                .stream()
//                .map(x -> {
//                    String[] splitted = x.split(",");
//                    Car car = new Car();
//                    car.division = splitted[1];
//                    car.modelYear = Integer.parseInt(splitted[0]);
//                    // ...
//                    return car;
//                })
//                .collect(Collectors.toList());
//




        //System.out.println(cars);

//        cars.stream()
//                .filter(x->x.division.startsWith("Aston"))
//                .forEach(System.out::println);

//        cars.stream()
//                .filter(x->x.division.startsWith("B"))
//                .map(x -> x.division)
//                .distinct()// Unicalnoje value like set
//                .forEach(System.out::println);
    }
}
