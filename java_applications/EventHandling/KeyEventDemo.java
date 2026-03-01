import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class KeyEventDemo implements KeyListener {
JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b;
public KeyEventDemo() {
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
b.addKeyListener(this);
    }
public void keyTyped(KeyEvent ke) {}
public void keyReleased (KeyEvent ke) {}
public void keyPressed (KeyEvent ke) {
int a = Integer.parseInt(t1.getText());
if(ke.getKeyChar()=='a') {
int c = a+a;
t2.setText(String.valueOf(c));
        }
else if (ke.getKeyChar()=='s') {
int c = a-a;
t2.setText(String.valueOf(c));
        }
else {
t2.setText("You pressed wrong key");
        }
    }
public static void main(String[] args) {
new KeyEventDemo();
    }
}