import javax.swing.*;

public class App {
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {

        JFrame myframe = new JFrame( "App");
        myframe.setContentPane(new App().mainPanel);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.pack();
        myframe.setSize(400,400);
        myframe.setVisible(true);
    }
}
