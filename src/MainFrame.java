/*Java Program to switch between frames using buttons*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Switch_Frame implements ActionListener
{
    static JFrame frame1;
    static JFrame frame2;
    static JButton next;
    static JButton close;
    static JButton back;
    //Driver function
    public static void main(String args[])
    {
        //Create frame 1
        frame1 = new JFrame("LEGO Digital Mosaic Designer");
        frame1.setSize(1000,600);
        frame1.setLayout(null);
        frame1.setBackground(Color.white);
        //Create next and close buttons
        next = new JButton("Start Building (64 x 64)");
        close = new JButton("Close");
        next.setBounds(75,50,100,50);
        close.setBounds(75,150,100,50);

        frame1.add(next);
        frame1.add(close);

        Switch_Frame obj=new Switch_Frame();

        next.addActionListener(obj);
        close.addActionListener(obj);
        frame1.setVisible(true);



        JLabel backgroundLabel = new JLabel(new ImageIcon("images/legosymbol.webg"));
        backgroundLabel.setLayout(new FlowLayout());




        JLabel label = new JLabel("Welcome to LEGO Digital Mosaic Designer");
        label.setFont(new Font("Papyrus", Font.BOLD, 30));
        backgroundLabel.add(label);

    }

    public void actionPerformed(ActionEvent e)
    {
        String button=e.getActionCommand();
        if(button.equals("Next"))
        {
            create_frame2();
        }
        if(button.equals("Close"))
        {
            frame1.dispose();
        }
        if(button.equals("Back"))
        {
            frame2.dispose();
        }
    }
    //function to create Frame 2
    public static void create_frame2()
    {
        //Create frame 2
        frame2 = new JFrame("Frame 2");
        frame2.setSize(250,250);
        frame2.setLayout(null);
        frame2.setBackground(Color.white);
        //Create back button
        back = new JButton("Back");
        back.setBounds(75,100,100,50);
        //Add the button to frame 2
        frame2.add(back);
        //Create an object
        Switch_Frame obj=new Switch_Frame();
        //Associate ActionListener with the buttons
        back.addActionListener(obj);
        //Display frame 2
        frame2.setVisible(true);
    }

}