package Java2.SS3;

import java.util.Scanner;

public class MainBook {
    private static Scanner scanner = new Scanner(System.in);
    private static BookList bookList = new BookList("Java");



    public static void main(String[] args) {
        boolean quite = false;
        startBookList();
        printAction();
        while(!quite) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\n Shuting down .. ");
                    quite = true;
                    break;

                case 1:
                    bookList.printList();
                    break;

                case 2:
                    addNewBook();
                    break;

                case 3:
                    updateBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    queryBook();
                    break;
                case 6:
                    printAction();
                    break;


            }



        }

    }
    private static void addNewBook() {
        System.out.println("Enter new book Name: ");
        String book = scanner.nextLine();
        System.out.println("Enter name tác giả: ");
        String TacGia = scanner.nextLine();
       Books newBook = Books.createBook(book, TacGia);
        if(bookList.addNewBook(newBook)) {
            System.out.println("New Book Added: name = "+ book + " , Tác Giả" + TacGia );
        }else {
            System.out.println("Can't add, " + book +" already on file");
        }
    }


    private static void updateBook() {
        System.out.println("Enter existing Book name : ");
        String book = scanner.nextLine();
        Books extBook = bookList.queryBook(book);
        if(extBook == null)
        {
            System.out.println("Cannot found book");
            return;
        }

        System.out.println("Enter new Conatct Name: ");
        String newBook = scanner.nextLine();
        System.out.println("Enter new Phone Number: ");
        String newTácgiả = scanner.nextLine();

        Books newBooks = Books.createBook(newBook, newTácgiả);
        if(bookList.updateBook(extBook, newBooks))
        {
            System.out.println("Successfully updated");
        }else {
            System.out.println("Error Updating Book");
        }
    }

    private static void removeBook() {
        System.out.println("Enter existing Book name : ");
        String name = scanner.nextLine();
        Books extBook = bookList.queryBook(name);
        if(extBook == null)
        {
            System.out.println("Cannot found contact");
            return;
        }

        if(bookList.removeBook(extBook)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error Deleting Book");
        }
    }

    private static void queryBook() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Books extContact = bookList.queryBook(name);
        if(extContact == null)
        {
            System.out.println("Cannot found contact");
            return;
        }

        System.out.println("Name : " + extContact.getBook() +
                " Phone Number is: " + extContact.getTácGiả());
    }


    private static void startBookList() {
        System.out.println("Starting Book library . . .");
    }

    private static void printAction() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutDown\n" +
                "1 - to print book list\n"+
                "2 - to add a new book\n"+
                "3 - to update an existing book\n"+
                "4 - to remove and existing book\n"+
                "5 - query for existing book\n"+
                "6 - to print a list of available actions.");
        System.out.println("Choose Your Action: ");
    }

}
