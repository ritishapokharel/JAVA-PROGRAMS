import javax.swing.*;

class TextField {
    TextField() {
        JFrame f = new JFrame("Login Form");

        f.setLayout(null);   

        JLabel l = new JLabel("Username");
        l.setBounds(100,80,100,30);

        JTextField t = new JTextField();
        t.setBounds(100,120,150,30);

        f.add(l);
        f.add(t);

        f.setSize(350,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextField();
    }
}