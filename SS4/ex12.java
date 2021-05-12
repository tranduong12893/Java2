package Java2.SS4;

import java.sql.*;

public class ex12 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String check = "CodeLean VN";
            String select1 = "select title, price from books WHERE author = '"+ check +"';";
            System.out.println("the SQL  statement is: "+select1 + "\n");
            ResultSet call = stmt.executeQuery(select1);
            while (call.next()){
                String title = call.getString("title");
                double price = call.getDouble("price");
                System.out.println(title+" , "+price);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
