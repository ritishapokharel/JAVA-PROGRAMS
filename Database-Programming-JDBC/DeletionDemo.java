import java.sql.*;
class DeletionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lict", "root", ""
            );
            Statement st = con.createStatement();
            int result = st.executeUpdate(
                "DELETE FROM student WHERE id=2"
            );
            System.out.println(result + " Row is deleted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}