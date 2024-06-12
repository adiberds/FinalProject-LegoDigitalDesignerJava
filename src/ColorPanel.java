import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ColorPanel extends JPanel {
    private List<JButton> colorButtons;
    private LegoMosaic legoMosaic;

    public ColorPanel(LegoMosaic legoMosaic, SecondFrame64X64 secondFrame64X64) {
        this.legoMosaic = legoMosaic;
        setLayout(new GridLayout(0, 1));
        colorButtons = createColorButtons(secondFrame64X64);
        colorButtons.forEach(this::add);
    }

    private List<JButton> createColorButtons(SecondFrame64X64 secondFrame64X64) {
        List<String> colorNames = Arrays.asList("Brick Yellow", "Bright Green", "Bright Orange", "Bright red",
                "Bright Yellow", "Bright Yellowish Green", "Bright_Blue", "Bright_Reddish_Violet",
                "Cool Yellow", "Dark Azur", "Dark Brown", "Dark Green", "Dark Orange", "Dark_Stone_Grey",
                "Earth Blue", "Earth Green", "Earth_Blue", "Flame Yellowish Orange", "Lavendar",
                "Light Nougat", "Light Royal Blue", "Light Stone Grey", "Medium Azur", "Medium Blue",
                "Medium Lilac", "Medium Nougat", "Medium Stone Grey", "Metalic Dark Grey", "New Dark Red",
                "Nougat", "Olive Green", "Phosph Green", "Sand Blue", "Sand Green", "Sand Yellow", "Silver",
                "Spring Yellowish Green", "Transparent Blue", "Transparent Bright Bluish Violet",
                "Transparent Flourescent Blue", "Transparent Light Blue", "Transparent Medium Reddish-Violet",
                "Warm Gold", "White");
        return colorNames.stream()
                .map(colorName -> createColorButton(colorName, secondFrame64X64))
                .toList();

    }

    private JButton createColorButton(String colorName, SecondFrame64X64 secondFrame64X64) {
        String imagePath = "StudImages/" + colorName + ".jpg";
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(10, 10));
        button.addActionListener(e -> {
            legoMosaic.getChosenColor(colorName);
            secondFrame64X64.setSelectedColorImageFile(imagePath);

        });
        return button;
    }


}
