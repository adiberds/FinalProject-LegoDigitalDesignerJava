import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SecondFrame64X64 extends JPanel {
    private JPanel gameGrid;

    public SecondFrame64X64() {
        initUI();
    }

    private final void initUI() {
        setLayout(new BorderLayout(5, 5));
        setBackground(Color.YELLOW);
        setBorder(new EmptyBorder(4, 4, 4, 4));
        createMap(64, 64);
        add(gameGrid);

        JPanel controlsConstrain = new JPanel(new BorderLayout(4, 4));
        add(controlsConstrain, BorderLayout.LINE_END);
        controlsConstrain.setBackground(Color.GREEN);

        JPanel controls = new JPanel(new GridLayout(0, 1, 0, 25));
        controlsConstrain.add(controls, BorderLayout.PAGE_START);
        controls.setBackground(Color.CYAN);
        controls.setBorder(new EmptyBorder(40, 20, 20, 20));

    }

    public void createMap(int maxX, int maxY) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int squareSize = Math.min(screenSize.width / 2, screenSize.height / 2) / Math.max(maxX, maxY);
        int gridWidth = squareSize * maxX;
        int gridHeight = squareSize * maxY;

        gameGrid = new JPanel(new GridLayout(maxX, maxY, 0, 0));
        gameGrid.setBackground(Color.YELLOW);

        ImageIcon icon = new ImageIcon("images/Studgrid.jpg");

        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                JButton button = new JButton(icon);
                button.setPreferredSize(new Dimension(squareSize, squareSize));
                String name = String.format("[%d, %d]", i, j);
                button.setName(name);
                gameGrid.add(button);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Start Building Your Mosaic!");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new SecondFrame64X64());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}