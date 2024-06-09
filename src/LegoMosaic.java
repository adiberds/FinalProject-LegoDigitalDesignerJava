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


    public void addBrick(int row, int col, String color) {
        String key = row + "," + col;
        LegoBrick brick = new LegoBrick(color);
        grid.put(key, brick);
    }


    public void removeBrick(int row, int col) {
        String key = row + "." + col;
        grid.remove(key);
    }

    public void setChosenColor(String color){
        chosenColor = color;
    }
    public String setChosenColor(){
        return chosenColor;
    }
}