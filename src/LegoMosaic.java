import java.util.HashMap;

public class LegoMosaic {

    private HashMap<PartsCount, LegoBrick> grid;

    public LegoMosaic(PartsCount, LegoBrick) {
        grid = new LegoMosaic<PartsCount, LegoBrick>;
    }
    //making a object LegoBrick in the grid system


    public void addBrick(LegoBrick brick, int row, int col) {
        grid.put(row + "," + col, brick);
    }


    public void removeBrick(LegoBrick brick, int row, int col) {
grid.remove(row + "," + col, brick);
    }
}