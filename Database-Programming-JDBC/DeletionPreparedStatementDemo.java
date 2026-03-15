import java.sql.*;
public class DeletionPreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lict", "root", ""
            );
            PreparedStatement pst = con.prepareStatement(
                "DELETE FROM student WHERE id=?"
            );
            pst.setInt(1, 2);
            int result = pst.executeUpdate();
            System.out.println(result + " Row is deleted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}