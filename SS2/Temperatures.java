package Java2.SS2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> temper = new ArrayList<>();
        System.out.print("Số ngày cần nhập nhiệt độ:");
        int n,tb=0,d=0;
        n = scan.nextInt();
        for(int i=0; i<n;i++){
            System.out.print("Nhiet do cao nhat ngay thu "+ (i+1)+":" );
            int t = scan.nextInt();
            temper.add(t);
        }
        for(int i=0; i<temper.size();i++){
            tb=tb+temper.get(i);
        }
        tb=tb/n;
        for (int i=0;i<temper.size();i++){
            if(temper.get(i)>tb){
                d++;
            }
        }
        System.out.println("Nhiệt độ trung bình là:"+tb);
        System.out.println(d+" ngày có nhiệt độ cao hơn nhiệt độ trung bình");
    }
}
