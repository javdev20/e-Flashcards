import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        buildGUI();

    }

    private static void buildGUI() {
        JFrame frame = new JFrame("Main Program");

        JPanel mainPanel = new JPanel();

        JButton build = new JButton("Build");
        JButton play = new JButton("Play");

        mainPanel.add(build);
        mainPanel.add(play);

        frame.setBounds(400, 250, 400, 300);
        frame.setResizable(false);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
