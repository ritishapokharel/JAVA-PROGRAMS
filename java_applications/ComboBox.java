import javax.swing.*;

class ComboBox {
    ComboBox() {
        JFrame f = new JFrame("ABC");
        f.setLayout(null);

        JLabel l = new JLabel("Country");
        l.setBounds(30, 30, 100, 20); 

        String str[] = {"Nepal", "India", "Russia", "China"};
        JComboBox<String> cb = new JComboBox<>(str);
        cb.setBounds(30, 60, 200, 30); 

        f.add(l);
        f.add(cb);

        f.setSize(350, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}