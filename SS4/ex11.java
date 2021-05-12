package Java2.SS4;

import java.sql.*;

public class ex11 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String select = "select * from books";
            System.out.println("the SQL  statement is: " + select + "\n");
            ResultSet all = stmt.executeQuery(select);
            while (all.next()){
                int    id    = all.getInt("id");
                String title = all.getString("title");
                String author= all.getString("author");
                double price = all.getDouble("price");
                int    qty   = all.getInt("qty");
                System.out.println(id+" , "+title+" , "+author+" , "+price+" , "+qty);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
