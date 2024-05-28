import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;


public class SecondFrame64X64{

JFrame frame = new JFrame();
JButton[][] LegoGrid;

public SecondFrame64X64(int width, int length){
    JFrame frame = new JFrame("LEGO Mosaic");
    frame.setLayout(new GridLayout(length,width));
    LegoGrid = new JButton[width][length];
    for(int y = 0; y <length; y++){
        for(int x = 0; x<width; x++){
            LegoGrid[x][y] = new JButton();
            frame.add(LegoGrid[x][y]);
        }


    }
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
public static void main(String[] args){new SecondFrame64X64(100, 100);
}
}
