package Java2.SS4;

import java.sql.*;

public class ex13 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String check = "CodeLean VN";
            double check1 = 30;
            String select2 = "select title, author, price, qty from books \nWHERE author = '"
                    + check +"'\nOR price >="+check1
                    +" \nORDER BY price DESC, id ASC;";
            System.out.println("the SQL  statement is: "+select2 + "\n");
            ResultSet call1 = stmt.executeQuery(select2);
            while (call1.next()){
                String title = call1.getString("title");
                String author= call1.getString("author");
                double price = call1.getDouble("price");
                int    qty   = call1.getInt("qty");
                System.out.println(title+" , "+author+" , "+price+" , "+qty);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
