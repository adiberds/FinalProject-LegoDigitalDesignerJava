import javax.swing.*;
import java.awt.*;

public class MainFrame {
     {
        JFrame mainFrame = new JFrame("LEGO Digital Mosaic Designer");
        mainFrame.setSize(1000, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton startButton = new JButton("Start Building (64 x 64)");
        JButton closeButton = new JButton("Close");

        startButton.setPreferredSize(new Dimension(200, 50));
        closeButton.setPreferredSize(new Dimension(200, 50));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(closeButton);

        startButton.addActionListener(e -> {
            JFrame secondFrame = new JFrame("Start Building Your Mosaic!");
            secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            secondFrame.getContentPane().add(new SecondFrame64X64());
            secondFrame.pack();
            secondFrame.setLocationRelativeTo(null);
            secondFrame.setVisible(true);
        });

        closeButton.addActionListener(e -> {
            System.exit(0);
        });

        mainFrame.add(buttonPanel);
        mainFrame.setVisible(true);

        JLabel label = new JLabel("Welcome to LEGO Digital Mosaic Designer");
        label.setFont(new Font("Papyrus", Font.BOLD, 30));
        mainFrame.add(label, BorderLayout.NORTH);
    }
}
