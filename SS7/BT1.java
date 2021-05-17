package Java2.SS7;

import java.sql.*;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String delete8000 = "delete from books where id>8000";
            System.out.println("The SQL statement is :"+ delete8000+"\n");
            int countDeleted = stmt.executeUpdate(delete8000);
            System.out.println(countDeleted+"records deleted.\n");
            String insert2record = "insert into books values "
                    + "(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55),"
                    + "(8002, 'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " + insert2record + "\n");
            int countInserted = stmt.executeUpdate(insert2record);
            System.out.println(countInserted + " records inserted.\n");
            String sqlInsert = "insert into books (id, title, author) values (2001, 'JavaJDBC MySQL','ThiDK')";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
            System.out.println("MOi ban nhap ID cuan sach muon xoa:");
            Scanner scanner = new Scanner(System.in);
            int Id = Integer.parseInt(scanner.nextLine());
            String deleteId = "delete from books where id="+Id;
            System.out.println("The SQL statement is :"+ deleteId+"\n");
            countDeleted = stmt.executeUpdate(deleteId);
            System.out.println(countDeleted+"records deleted.\n");
            System.out.println("Moi ban nhap id:");
            int id1 = Integer.parseInt(scanner.nextLine());
            System.out.println("MOi ban nhap ten quan sach:");
            String title = scanner.nextLine();
            System.out.println("Nhap ten tac gia:");
            String author = scanner.nextLine();
            System.out.println("Moi ban nhap gia ban:");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Moi ban nhap so luong sach:");
            int qty = Integer.parseInt(scanner.nextLine());
            String insert1= "insert into books values(?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insert1);
            pstmt.setInt(1,id1);
            pstmt.setString(2,title);
            pstmt.setString(3,author);
            pstmt.setDouble(4, price);
            pstmt.setInt(5,qty);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " drink inserted!");
            String check1 = "select * from books";
            ResultSet book = stmt.executeQuery(check1);
            ResultSetMetaData bookMD = book.getMetaData();
            int numColums1 = bookMD.getColumnCount();
            for (int i = 1; i <= numColums1; i++) {
                System.out.printf("%-20s", bookMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= numColums1; i++) {
                System.out.printf("%-20s", "(" + bookMD.getColumnName(i) + ")");
            }
            System.out.println();
            while (book.next()) {
                for (int i = 1; i <= numColums1; i++) {
                    System.out.printf("%-20s", book.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
