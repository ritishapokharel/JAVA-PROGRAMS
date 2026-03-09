import java.awt.event.*;
import javax.swing.*;

class ItemListenerDemo implements ItemListener {
    JFrame f;
    JCheckBox c;
    JLabel label;        

    ItemListenerDemo() {
        f = new JFrame();
        c = new JCheckBox("Java");
        label = new JLabel("Nothing selected yet"); 

        c.setBounds(100, 120, 80, 20);
        label.setBounds(70, 160, 200, 20);           

        f.add(c);
        f.add(label);                               

        f.setLayout(null);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
            label.setText("Java is selected");       
        else
            label.setText("Java is deselected");     
    }

    public static void main(String[] args) {
        new ItemListenerDemo();
    }
}