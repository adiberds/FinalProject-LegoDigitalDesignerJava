import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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


        ImageIcon background = new ImageIcon("images/Application.jpg");
        JLabel back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,500,600);



    }
}