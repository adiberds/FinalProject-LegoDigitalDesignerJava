import java.util.Scanner;
public class BrickMaker extends LegoBrick{
int size = 1;



public BrickMaker(int size, String color, String stud){
    super(size,color, stud); }



    public void CustomizeBrick(int size, String color, String stud){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Click size or color to customize:");

    String brickCustomizeOption  = scanner.nextLine();
    if(brickCustomizeOption.equalsIgnoreCase("color")) {
        System.out.println("Enter new color:");
        String newColor = scanner.nextLine();
        LegoBrick.setColor(newColor);
    }
else if(brickCustomizeOption.equals("size")){
        System.out.println("Enter new size:");
        String newSize = scanner.nextLine();
        LegoBrick.setSize(newSize);
        System.out.println("Size Updated!")
    }
else BrickMaker.CustomizeBrick;

    }
}





