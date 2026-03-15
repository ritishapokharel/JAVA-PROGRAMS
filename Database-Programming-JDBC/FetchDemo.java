import java.sql.*;
class FetchDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/lict", "root", ""
            );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("username") + " " +
                    rs.getString("password")
                );
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}