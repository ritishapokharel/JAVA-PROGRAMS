import java.sql.*;
public class InsertPreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url","un","pw");
            PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
            pst.setInt(1,2);
            pst.setString(2,"Ram");
            pst.setString(3,"Ritisha");
            int result = pst.executeUpdate();
            System.out.println(result + "Row is inserted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
