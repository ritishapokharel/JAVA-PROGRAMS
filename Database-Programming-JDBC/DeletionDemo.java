class InsertionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("url","un","pw");
            Statement st = con.createStatement();
            int result = st.executeUpdate("delete from Student values(1,'Ram','Chitwan')");
            System.out.println(result+"Row is deleted");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}