import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ActionEventDemo implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;

    ActionEventDemo() {

        f = new JFrame();

        l1 = new JLabel("Enter number");
        t1 = new JTextField(30);
        b = new JButton("Copy");
        l2 = new JLabel("Result");
        t2 = new JTextField(30);

        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(l2);
        f.add(t2);

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 10);
        f.setLayout(fl);

        f.setSize(350, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = t1.getText();
        t2.setText(s);
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}