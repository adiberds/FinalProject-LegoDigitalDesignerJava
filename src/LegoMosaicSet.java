import java.util.ArrayList;

public class LegoMosaicSet extends LegoBrick implements LegoMosaic {
private ArrayList<LegoBrick> brickSet;
public LegoMosaicSet(){
    brickSet = new ArrayList<>();
    super(size, color, stud);
}
//declaring lego mosaic which is a ArrayList


    public void addBrick(LegoBrick brick){
    brickSet.add(brick);
}
public void removeBrick(LegoBrick brick)
{
    brickSet.remove(brick);
}

public void displayBrick()
{
    for(LegoBrick brick : brickSet){
        brick.

    }
}

}
