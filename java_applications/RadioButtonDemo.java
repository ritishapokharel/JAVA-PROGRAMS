import javax.swing.*;

class RadioButtonDemo {

    RadioButtonDemo() {
        JFrame f = new JFrame("Gender Selection");
        f.setLayout(null);   

        JLabel l = new JLabel("Gender:");
        l.setBounds(30, 30, 100, 20);

        JRadioButton rb1 = new JRadioButton("Male", true);
        rb1.setBounds(30, 60, 100, 20);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(30, 90, 100, 20);

        JRadioButton rb3 = new JRadioButton("Others");
        rb3.setBounds(30, 120, 100, 20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        f.add(l);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);

        f.setSize(300, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}