import javax.swing.*;
class TextArea {
    TextArea() {
        JFrame f = new JFrame("ABC");
        JLabel l = new JLabel("Comment");
        l.setBounds(40,100,60,20);

        JTextArea to = new JTextArea("Comment now");
        to.setBounds(40,220,200,200);
        
        f.add(l);
        f.add(to);
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TextArea();
    }
}