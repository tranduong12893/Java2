package Java2.SS3;

import java.util.AbstractList;
import java.util.ArrayList;

public class BookList {
    private String myBook;
    private AbstractList<Books> myList;

    public BookList(String myBook) {
        this.myBook = myBook;
        this.myList = new ArrayList<Books>();
    }

    public boolean addNewBook(Books book){
        if(findBook(Books.getBook())>=0){
            System.out.println("Book is already on file");
        }
        myList.add(book);
        return true;
    }

    public boolean updateBook(Books oldBook , Books newBook) {
        int foundPosition = findBook(oldBook);
        if(foundPosition < 0) {
            System.out.println(oldBook.getBook() + " , was not found");
            return false;
        }

        this.myList.set(foundPosition, newBook);
        System.out.println(oldBook.getBook() + ", was replaced with " + newBook.getBook());
        return true;
    }

    public boolean removeBook(Books books) {
        int foundPosition = findBook(books);
        if(foundPosition < 0) {
            System.out.println(books.getBook() + " , was not found");
            return false;
        }
        this.myList.remove(foundPosition);
        System.out.println(books.getBook() + " was deleted");
        return true;
    }

    private int findBook(Books book){
        return this.myList.indexOf(book);
    }

    private int findBook(String Bookname){
        for(int i =0; i < myList.size(); i++) {
            Books book = this.myList.get(i);
            if(Books.getBook().equals(Bookname)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Books book) {
        if(findBook(book) >= 0) {
            return book.getBook();
        }
        return null;
    }

    public Books queryBook(String book) {
        int position = findBook(book);
        if(position >=0) {
            return this.myList.get(position);
        }
        return null;
    }

    public void printList() {
        System.out.println("Book list");
        for(int i = 0; i < this.myList.size(); i++) {
            System.out.println((i+1) + " ." +
                    this.myList.get(i).getBook() +
                    " -> " + this.myList.get(i).getTácGiả());
        }
    }
}
