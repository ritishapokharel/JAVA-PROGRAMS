import java.sql.*;
public class FetchPreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url","un","pw");
            PreparedStatement pst = con.prepareStatement("select * from student");
            pst.setInt(1,2);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
