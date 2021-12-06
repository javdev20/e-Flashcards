import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        runProgram();

    }

    private static void runProgram() {
        JFrame frame = new JFrame("Main Program");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JButton build = new JButton("Build Quiz Card");
        JButton play = new JButton("Play Quiz Card");

        build.setPreferredSize(new Dimension(200, 50));
        play.setPreferredSize(new Dimension(200, 50));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 5);
        c.gridx = 1;
        mainPanel.add(play, c);
        c.gridy = 1;
        c.gridx = 1;
        mainPanel.add(build, c);

        build.addActionListener(new ButtonListener());
        play.addActionListener(new PlayButtonListener());

        frame.setBounds(400, 250, 400, 300);
        frame.setResizable(false);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    private static class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCardBuilder builder = new QuizCardBuilder();
            builder.go();
        }
    }

    private static class PlayButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCardPlayer player = new QuizCardPlayer();
            player.go();
        }
    }
}
