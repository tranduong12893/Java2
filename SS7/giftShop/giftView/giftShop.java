package Java2.SS7.giftShop.giftView;

import Java2.SS7.eBookShop.Controllers.BookController;
import Java2.SS7.eBookShop.Models.Register;
import Java2.SS7.eBookShop.Models.User;
import Java2.SS7.giftShop.giftController.GiftController;

import java.util.Scanner;

public class giftShop {
    public static void main(String[] args) {
        System.out.println("Welcome to E-GiftShop!!!");
        System.out.println("============================================================");
        menuVisit();
    }

    public static void menuVisit(){
        Scanner scanner = new Scanner(System.in);
        int chon;
        System.out.println("1. Display gift in store.");
        System.out.println("2. Insert new gift in GiftList.");
        System.out.println("3. Delete gift for GiftList.");
        System.out.println("4. Exit");
        do {
            System.out.println("Your choice:");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    GiftController giftctrl = new GiftController();
                    giftctrl.displayGift();
                    break;
                case 2:
                    GiftController giftctrl2 = new GiftController();
                    giftctrl2.addGift();
                    break;
                case 3:
                    GiftController giftctrl3 = new GiftController();
                    giftctrl3.deleteGf();
                    break;
            }
        }while (chon!=4);
    }
}
