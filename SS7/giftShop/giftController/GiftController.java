package Java2.SS7.giftShop.giftController;

import Java2.SS7.eBookShop.Controllers.BookController;
import Java2.SS7.eBookShop.Models.Book;
import Java2.SS7.giftShop.giftModel.gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    String url = "jdbc:mysql://127.0.0.1:3306/giftshop";
    String username = "root";
    String password = "";

    List<gift> giftList = new ArrayList<>();

    public List<gift> loadingGift() {
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from gift";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                int id = rset.getInt("id");
                String name = rset.getString("name");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                gift gif = new gift(id, name, price, qty);
                giftList.add(gif);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return giftList;
    }

    public void addGift(){
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Id:");
            int id1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the name Gift:");
            String name1 = scanner.nextLine();
            System.out.println("Enter price:");
            double price1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter Qty:");
            int qty1 = Integer.parseInt(scanner.nextLine());
            String insert1= "insert into gift values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insert1);
            pstmt.setInt(1,id1);
            pstmt.setString(2,name1);
            pstmt.setDouble(3, price1);
            pstmt.setInt(4,qty1);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " gift inserted!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void deleteGf() {
        gift obj = new gift();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setId(id);
        GiftController ctr = new GiftController();
        ctr.deleteGift(obj);
    }

    public boolean deleteGift(gift gift) {
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String select = "select * from gift where id =" + gift.getId();
            ResultSet rset = stmt.executeQuery(select);
            if (!rset.next()) {
                String delete = "delete from gift where id =" + gift.getId();
                stmt.executeUpdate(delete);
                loadingGift();
                System.out.println("gift has been deleted");
                return true;
            } else
                System.out.println("Cannot delete/No gift found");
            return false;
        } catch (SQLException ex) {
            System.out.println("Cannot delete this gift");
            ex.printStackTrace();
            return false;
        }
    }

    public void displayGift() {
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from gift";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-20s", rsetMD.getColumnName(i));
            }
            loadingGift();
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColums; i++) {
                    System.out.printf("%-20s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
