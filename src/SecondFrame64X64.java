import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SecondFrame64X64 extends JPanel {
    private static final int SIDE = 64;
    private static final int BUTTON_WIDTH = 13;
    private LegoMosaic legoMosaic;

    public SecondFrame64X64(LegoMosaic legoMosaic) {
        this.legoMosaic = legoMosaic;
        setLayout(new GridLayout(SIDE, SIDE, 0, 0));
        createGrid();
    }

    public void createGrid() {
        URL imageURL = getClass().getResource("/images/Dark_Stone_Grey(13X13).png");
        Image img = null;
        try {
            img = ImageIO.read(imageURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(img);
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                JButton button = new JButton(icon);
                button.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_WIDTH));
                button.setMargin(new Insets(0, 0, 0, 0));
                button.setBorder(null);
                int row = i;
                int col = j;
                button.addActionListener(e -> legoMosaic.addBrick(row, col, "default"));
                add(button);
            }
        }
    }

    private static void createAndShowUI(LegoMosaic legoMosaic) {
        JFrame frame = new JFrame("Start Building Your Mosaic!");
        frame.getContentPane().add(new SecondFrame64X64(legoMosaic)); // Pass legoMosaic to the constructor
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}