package Java2.SS1;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        System.out.println("Is the topcampanies list empty ?: "+topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amaron");
        topCompanies.add("Facebook");

        System.out.println("Here are the top" + topCompanies.size()+" Companies in the world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String SecondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("second best company: "+ SecondBestCompany);
        System.out.println("Last Company: " +lastCompany);

        topCompanies.set(4,"Walmart");
        System.out.println("Modified top cpmpany list: "+ topCompanies);
    }
}
