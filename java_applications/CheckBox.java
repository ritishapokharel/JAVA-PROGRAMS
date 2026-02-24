import javax.swing.*;

class CheckBox {
    CheckBox() {
        JFrame f = new JFrame("Courses");
        f.setLayout(null); 

        JLabel l = new JLabel("Select your courses:");
        l.setBounds(30, 20, 200, 30);

        JCheckBox cb1 = new JCheckBox("Java", true);
        cb1.setBounds(30, 60, 100, 20);

        JCheckBox cb2 = new JCheckBox("Ruby");
        cb2.setBounds(30, 90, 100, 20);

        JCheckBox cb3 = new JCheckBox("Python");
        cb3.setBounds(30, 120, 100, 20);

        JCheckBox cb4 = new JCheckBox("C++");
        cb4.setBounds(30, 150, 100, 20);

        JCheckBox cb5 = new JCheckBox("JavaScript");
        cb5.setBounds(30, 180, 120, 20);

        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);

        f.setSize(350, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBox();
    }
}