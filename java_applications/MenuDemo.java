import javax.swing.*;
class MenuDemo {
    MenuDemo() {
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem i1 = new JMenuItem("open");
        JMenuItem i2 = new JMenuItem("save");
        m1.add(i1);
        m1.add(i2);
        mb.add(m1);
        mb.add(m2);
        f.setJMenuBar(mb);

         f.setSize(350, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}