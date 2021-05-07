package Java2.SS2;

import java.util.Scanner;

public class main extends ContactList{
    public static void main(String[] args) {
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting phone...");
        System.out.println();
        System.out.println("Available actions:");
        System.out.println("press");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to print contact");
        System.out.println("2 - to add a new contact");
        System.out.println("3 - to update existing an existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list oof available actions");
        System.out.println("Choose your action:");
        System.out.println("");
        do{
            System.out.println("Enter action: (6 to show available actions");
            i = Integer.parseInt(scan.nextLine());
            switch (i){
                case 0:
                    break;
                case 1:
                    System.out.println("Contact List:");
                    for (int y=0;y<contact.size();y++){
                        System.out.println((y+1)+"."+ user.getName()+" -> "+user.getTelNumber());
                    }
                    break;
                case 2:
                    addContact
                    break;
                case 3:
                    System.out.println("Enter existing contact name");
                    String u = scan.nextLine();
                    System.out.println("Enter new contact name:");
                    String n1 = scan.nextLine();
                    System.out.println("Enter new contact phone number:");
                    String p1 = scan.nextLine();
                    contact.set(contact.indexOf(u), new user(n1,p1));
                    System.out.println(u+", was replaced with "+n1);
                    System.out.println("Successfully update record");
                    break;
                case 4:
                    System.out.println("Enter existing contact name:");
                    String r = scan.nextLine();
                    System.out.println(r+", was deleted.");
                    System.out.println("Successfully deleted");
                    contact.remove(contact.indexOf(r));
                    break;
                case 5:
                    System.out.println("Enter existing contact name:");
                    String n2 = scan.nextLine();
                    System.out.println("Name: "+n2+" phone number is "+ contact(contact.indexOf(n2)).getName());

            }


        }while ((i<7)&&(i!=0));
    }


}
}
