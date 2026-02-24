import javax.swing.*;

class TableDemo {
    TableDemo() {
        JFrame f = new JFrame("Employee Table");
        f.setLayout(null);  

        JLabel l = new JLabel("Employee");
        l.setBounds(30, 20, 200, 30);

        String col[] = {"ID", "Name", "Address"};

        String data[][] = {
                {"1", "Ritisha", "Chitwan"},
                {"2", "Aayushma", "KTM"},
                {"3", "Avisha", "Nawalpur"},
        };

        JTable t = new JTable(data, col);
        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(30, 60, 280, 150);  

        f.add(l);
        f.add(sp);

        f.setSize(350, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TableDemo();
    }
}