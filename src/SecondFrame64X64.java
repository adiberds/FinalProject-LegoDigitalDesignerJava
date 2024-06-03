import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

class SecondFrame64X64 extends JPanel
{
    private static final int SIDE = 64;
    private static final int BUTTON_WIDTH = 13;

    public SecondFrame64X64()
    {
        setLayout(new GridLayout(SIDE, SIDE, 0, 0));
        for (int i = 0; i < SIDE; i++)
        {
            for (int j = 0; j < SIDE; j++)
            {
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_WIDTH));
                add(btn);
            }
        }
    }

    private static void createAndShowUI()
    {
        JFrame frame = new JFrame("Start Building Your Mosaic!");
        frame.getContentPane().add(new SecondFrame64X64());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowUI();
            }
        });
    }
}