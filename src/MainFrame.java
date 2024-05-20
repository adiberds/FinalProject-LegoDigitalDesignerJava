import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MainFrame extends JFrame {



    public MainFrame() {
        setTitle("LEGO Digital Mosaic Designer");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());









        JLabel backgroundLabel = new JLabel(new ImageIcon("images/legosymbol.webg"));
        backgroundLabel.setLayout(new FlowLayout());




        JLabel label = new JLabel("Welcome to LEGO Digital Mosaic Designer");
        label.setFont(new Font("Papyrus", Font.BOLD, 30));
        backgroundLabel.add(label);

        JPanel openingPanel = new JPanel ();
        JPanel buildingPanel = new JPanel ();

        JButton button = new JButton("Start Building 64 x 64");
        backgroundLabel.add(button);





        setContentPane(backgroundLabel);


        setVisible(true);

    }
    public void mouseClicked(MouseEvent e){
if mouseClicked(){


        }
    }






    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }}
