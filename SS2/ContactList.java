package Java2.SS2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList extends Contact {
        Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                List<Contact> contact = new ArrayList<>();
                contact.add(new Contact("Thành", "0987365245"));
                contact.add(new Contact("Đạt smock","0357854852"));
                contact.add(new Contact("Tiến","0859654745"));
                contact.add(new Contact("Hoàng Anh","0988888888"));
                contact.add(new Contact("Cô Thi","0986868686"));
                public void addContact(){
                        System.out.println("Enter new contact name:");
                        String n = scan.nextLine();
                        System.out.println("Enter phone number:");
                        String p = scan.nextLine();
                        contact.add(new user(n,p));
                        System.out.println("New contact added: name = "+ n + ", phone = "+ p);
                }
        }


}
