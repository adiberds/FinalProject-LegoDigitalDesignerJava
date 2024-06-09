import java.util.HashMap;

public class LegoMosaic {

    private HashMap<String, LegoBrick> grid;
    private String chosenColor;

    public LegoMosaic()
    {
        grid = new HashMap<>();
        chosenColor = "white";
    }
    //making a object LegoBrick in the grid system


    public void addBrick(LegoBrick brick, int row, int col) {

        grid.put(row + "," + col,brick);
    }




    public void setChosenColor(String color){
        chosenColor = color;
    }
    public String setChosenColor(){
        return chosenColor;
    }
}