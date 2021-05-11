package Java2.SS3;

public class Books {
    private static String book;
    private String  TácGiả;

    public Books(String book, String tácGiả) {
        this.book = book;
        this.TácGiả = tácGiả;
    }
    public static Books createBook(String book,String tácGiả){
        return new Books(book,tácGiả);
    }

    public static String getBook() {
        return book;
    }

    public String getTácGiả() {
        return TácGiả;
    }
}
