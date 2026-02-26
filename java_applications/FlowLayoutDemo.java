import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo {

    FlowLayoutDemo() {
        JFrame f = new JFrame();

        f.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}