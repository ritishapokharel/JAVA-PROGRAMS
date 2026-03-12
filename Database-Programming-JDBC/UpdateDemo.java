import java.sql.*;

class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("url", "un", "pw");
            Statement st = con.createStatement();
            int result = st.executeUpdate("UPDATE Student SET Name='echo' WHERE ID=1");
            System.out.println(result + " row is updated");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}