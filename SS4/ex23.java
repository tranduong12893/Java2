package Java2.SS4;

import java.sql.*;

public class ex23 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String products = "select ProductName from products";
            System.out.println("The SQL statement is: "+ products+"\n");
            ResultSet print1 = stmt.executeQuery(products);
            while (print1.next()){
                String ProductName = print1.getString("ProductName");
                System.out.println(ProductName);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
