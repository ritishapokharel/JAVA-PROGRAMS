import java.sql.*;

class InsertionDb {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java", "root", "");
            Statement st = con.createStatement();
            int result = st.executeUpdate("INSERT INTO javat VALUES(1, 'Ritisha', '1234')");
            System.out.println(result + " Row is inserted");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}