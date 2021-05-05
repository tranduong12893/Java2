package Java2.SS1;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExmple {
    public static void main(String[] args) {
        List<String> programmmingLanguages = new ArrayList<>();
        programmmingLanguages.add("C");
        programmmingLanguages.add("C++");
        programmmingLanguages.add("Java");
        programmmingLanguages.add("Kotlin");
        programmmingLanguages.add("Python");
        programmmingLanguages.add("Perl");
        programmmingLanguages.add("Ruby");

        System.out.println("Initial List: "+ programmmingLanguages);

        programmmingLanguages.remove(5);
        System.out.println("Apter remove(5): "+ programmmingLanguages);
        boolean isRemoved = programmmingLanguages.remove("Kotlin");
        System.out.println(" After remove(Kotlin"+ programmmingLanguages);


        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        programmmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmmingLanguages);
        programmmingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
        System.out.println("After Removing all elements that start with \"C\": " + programmmingLanguages);
        programmmingLanguages.clear();
        System.out.println("After clear(): " + programmmingLanguages);
    }
}
