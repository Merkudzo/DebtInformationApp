
package borcuchun;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SQLiteConnection {
   
    String url="jdbc:sqlite:BorcSiyahi.db"; //C:/Users/Merkudzo/Desktop/
    
    private Connection connect(){
        Connection conn=null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Çox təəssüf sqlite ilə əlaqə alınmır");
        }
        return conn;
    }
    
    
    public ArrayList comboboxda_cap(){
        
        // burada ad soyad və adlandirmanı götürüb Arraylistə əlavə edirəmki
        // sonra keçib BorcMelumatPage-də həmin listən çıxarış edib istifadə edim
        ArrayList<String> adSoyadAdlanma = new ArrayList<String>();
        String sql="SELECT DISTINCT ad,soyad,adlandirma FROM borc_aldiqlarim ORDER BY ad";
        try(Connection conn=this.connect(); 
            Statement stmnt=conn.createStatement();
            ResultSet rs=stmnt.executeQuery(sql)){
            String ad, soyad,adlandirma;
            while(rs.next()){
                ad=rs.getString("ad");
                soyad=rs.getString("soyad");
                adlandirma=rs.getString("adlandirma");
                adSoyadAdlanma.add(ad);
                adSoyadAdlanma.add(soyad);
                adSoyadAdlanma.add(adlandirma);
            } 
            return adSoyadAdlanma;
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void yeniBorcElave(String tarix, String ad, String soyad, String adlandirma, double alinanmal, double qaytarilanborc)
    {
        String sql="INSERT INTO borc_aldiqlarim (tarix, ad, soyad, adlandirma, alinan_borc, qaytarilan_borc) VALUES (?, ? , ?, ?, ?, ?)";
        try
        {
            Connection conn=this.connect();
            PreparedStatement stmnt=conn.prepareStatement(sql);
            stmnt.setString(1, tarix);
            stmnt.setString(2, ad);
            stmnt.setString(3, soyad);
            stmnt.setString(4, adlandirma);
            stmnt.setDouble(5, alinanmal);
            stmnt.setDouble(6, qaytarilanborc);
            stmnt.executeUpdate();
            
            stmnt.close();   conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

     public void Update(String deyisilecekTarix, double alinanmal, double qaytarilanborc, int id)
    {
        String sql="UPDATE borc_aldiqlarim SET tarix=?, alinan_borc=? , qaytarilan_borc=? WHERE id=?";
        try
        {
            Connection conn=this.connect();
            PreparedStatement stmnt=conn.prepareStatement(sql);
            stmnt.setString(1, deyisilecekTarix);
            stmnt.setDouble(2, alinanmal);
            stmnt.setDouble(3, qaytarilanborc);
            stmnt.setInt(4, id);
           
            stmnt.executeUpdate();
            
            stmnt.close();   conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
     
     
    public void Delete(int id)
    {
        String sql="DELETE from borc_aldiqlarim where id=?";
        try
        {
            Connection conn=this.connect();
            PreparedStatement stmnt=conn.prepareStatement(sql);
            stmnt.setInt(1, id);
           
            stmnt.executeUpdate();
            
            stmnt.close();   conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    } 
    
}