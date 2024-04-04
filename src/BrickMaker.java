import java.util.Scanner;
public class BrickMaker extends LegoBrick{
int size = 1;



public BrickMaker(int size, String color, String stud){
    super(size,color, stud); }



    public static void CustomizeBrick(int size, String color, String stud){
        Scanner scanner = new Scanner;
    System.out.print("Click size or color to customize:");

    String brickCustomizeOption  = scanner.nextLine();
    if(brickCustomizeOption.equals("color")){
        System.out.println("Which color do you choose:");
    }
else if(brickCustomizeOption.equals("size")){
        System.out.println("Enter new size:");
    }

    }
}





