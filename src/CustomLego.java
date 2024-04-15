import java.util.Scanner;
public class CustomLego extends LegoBrick {
    private int size = 1;



    public CustomLego(int size, String color, String stud) {
        super(size, color, stud);
    }


    public void customizeBrick(int size, String color, String stud) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Click size or color to customize:");

        String brickCustomizeOption = scanner.nextLine();
        if (brickCustomizeOption.equalsIgnoreCase("color")) {
            System.out.println("Enter new color:");
            String newColor = scanner.nextLine();
            super.setColor(newColor);
        } else if (brickCustomizeOption.equals("size")) {
            System.out.println("Enter new size:");
            String newSize = scanner.nextLine();
            int newSizeInt = Integer.parseInt(newSize);
            super.setSize(newSizeInt);
            System.out.println("Size Updated!");
        } else {
            customizeBrick(size, color, stud);
        }
    }
}





