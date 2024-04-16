import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LEGO Digital Mosaic Designer");
        frame.setSize(10000,10000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        JLabel label = new JLabel("Welcome to LEGO Digital Mosaic Designer");
        label.setBounds(480,-100,1500,1000);
        frame.add(label);
        label.setFont(new Font("Papyrus", Font.BOLD, 50));


        JButton button = new JButton("Start Design");
        button.setBounds(850, 500, 150, 30);
        frame.add(button);

        frame.setVisible(true);


        ImageIcon background=new ImageIcon("images/Application.jpg");
        Image img=background.getImage();
        Image temp=img.getScaledInstance(500,600,Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        JLabel back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,500,600);

    }
}