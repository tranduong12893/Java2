package Java2.SS5;

import java.sql.*;

public class update1jdbcSelect {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from books";
            System.out.println("the SQL  statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();

            for (int i = 1; i<= numColums; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i =1; i<=numColums;i++){
                System.out.printf("%-30s", "("+rsetMD.getColumnName(i)+")");
            }
            System.out.println();
            while (rset.next()){
                for (int i=1;i<=numColums;i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
