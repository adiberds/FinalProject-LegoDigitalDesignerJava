public class LegoGrid {

    private LegoBrick[][] grid;

    public LegoGrid(int rows, int cols){
        grid = new LegoBrick[rows][cols];
    }
    //making a object LegoBrick in the grid system

public void addBrick(LegoBrick brick, int row, int col){
    if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
        grid[row][col] = brick;
    }
    else { System.out.println("Cannot place brick!");
    }
}
//addBrick which adds a brick in the grid when space is free, and when space isn't free, it does else which does a specific print statement

    public void removeBrick(LegoBrick brick, int row, int col){
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
            grid[row][col] = null;
        }
        else { System.out.println("Cannot remove brick!");
        }
    } //removeBrick which removes a brick in the grid when needed, and for the else I did the same thing as above method
    // however more code will be added for situations in which a brick above another brick wants to be kept however the brick under doesn't

}
