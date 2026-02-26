import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PrimeCompositeDemo implements ActionListener {

    JFrame f;
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;
    PrimeCompositeDemo() {
        f = new JFrame();
        l1 = new JLabel("Enter number");
        t1 = new JTextField(20);
        b = new JButton("Check");
        l2 = new JLabel("Result");
        t2 = new JTextField(20);
        f.add(l1);
        f.add(t1);
        f.add(b);
        f.add(l2);
        f.add(t2);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        f.setSize(350, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {

        int n = Integer.parseInt(t1.getText());
        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }

        if (c == 2) {
            t2.setText("Yes");
        } else {
            t2.setText("No");
        }
    }

    public static void main(String[] args) {
        new PrimeCompositeDemo();
    }
}