import javax.swing.*;
class ButtonDemo {
    ButtonDemo() {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(140,80,40,20);
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}