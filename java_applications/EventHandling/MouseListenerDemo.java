import java.awt.event.*;
import javax.swing.*;

class MouseListenerDemo implements MouseListener {
    JFrame f;
    JTextField t;

    MouseListenerDemo() {          
        f = new JFrame();
        t = new JTextField(30);
        t.setBounds(40, 60, 80, 20);
        f.add(t);
        f.setSize(300, 400);
        f.setLayout(null);        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {    
        t.setText("Clicked");
    }

    public void mousePressed(MouseEvent me) {    
        t.setText("Pressed");
    }

    public void mouseReleased(MouseEvent me) {   
        t.setText("Released");
    }

    public void mouseEntered(MouseEvent me) {    
        t.setText("Enter");
    }

    public void mouseExited(MouseEvent me) {     
        t.setText("Exited");
    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}