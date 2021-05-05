package Java2.SS1;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("lion");
        animals.add("Tiger");
        animals.add("Car");
        animals.add("dog");

        System.out.println(animals);
        animals.add("Elephant");
        System.out.println(animals);
    }
}
