import java.sql.*;

public class UpdatePreparedStatementDemo {
    public static void main(String[] args) {
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection("url", "un", "pw");

            
            PreparedStatement pst = con.prepareStatement("update student set name=? where ID=?" );

            
            pst.setString(1, "Ram");  
            pst.setInt(2, 2);         

            
            int result = pst.executeUpdate();

        
            System.out.println(result + " Row is updated");

            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}