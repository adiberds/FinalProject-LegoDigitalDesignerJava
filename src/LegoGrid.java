public class LegoGrid {

    private LegoBrick[][] grid;

    public LegoGrid(int rows, int cols){
        grid = new LegoBrick[rows][cols];
    }

public void addBrick(LegoBrick brick, int row, int col){
    if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
        grid[row][col] = brick;
    }
    else { System.out.println("Cannot place brick!");
    }
}

    public void removeBrick(LegoBrick brick, int row, int col){
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            grid[row][col] = null;
        }
        else { System.out.println("Cannot remove brick!");
        }
    }
}
