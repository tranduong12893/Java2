package Java2.SS2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class averageInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> integer = new ArrayList<>();
        System.out.println("Enter 5 integer values.");
        for (int i=0; i<5;i++){
            int t = scan.nextInt();
            integer.add(t);
        }
        double tb=0;
        for (int i=0;i<5;i++){
            System.out.println("Element " + i+" , typed value was " + integer.get(i));
            tb = (double) (tb+integer.get(i));
        }
        System.out.println("Average is "+ (tb/5));


    }
}
