import java.awt.*;
import javax.swing.*;

class GridLayoutDemo {
    GridLayoutDemo() {
        JFrame f = new JFrame();

    
        f.setLayout(new GridLayout(3, 3));

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");
        JButton b7 = new JButton("B7");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);

        f.setSize(300,350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}