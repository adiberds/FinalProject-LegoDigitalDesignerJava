import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

class MainFrame implements ActionListener
{ static JFrame mainFrame;
    static JButton startButton;
    static JButton closeButton;
    static Clip clip;

    public static void main(String[] args) {
        // Play background music
        playMusic("/LEGO Digital Mosaic Designer Main Theme.wav"); // Ensure the leading slash

        // Create the main frame
        mainFrame = new JFrame("LEGO Digital Mosaic Designer");
        mainFrame.setSize(1000, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the background panel
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon(MainFrame.class.getResource("/background-image.jpg"));
                Image image = icon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new FlowLayout());

        // Create buttons
        startButton = new JButton("Start Building (64 x 64)");
        closeButton = new JButton("Close");

        // Set button sizes
        startButton.setPreferredSize(new Dimension(200, 50));
        closeButton.setPreferredSize(new Dimension(200, 50));

        // Add buttons to the panel
        backgroundPanel.add(startButton);
        backgroundPanel.add(closeButton);

        // Add action listeners
        MainFrame obj = new MainFrame();
        startButton.addActionListener(obj);
        closeButton.addActionListener(obj);

        // Add the panel to the frame
        mainFrame.add(backgroundPanel);
        mainFrame.setVisible(true);

        // Display welcome message
        JLabel label = new JLabel("Welcome to LEGO Digital Mosaic Designer");
        label.setFont(new Font("Papyrus", Font.BOLD, 30));
        backgroundPanel.add(label);
    }

    public static void playMusic(String fileName) {
        try {
            // Load the resource using the class loader
            File musicPath = new File(MainFrame.class.getResource(fileName).getFile());
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music
            } else {
                System.out.println("Music file not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

