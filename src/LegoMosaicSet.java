import java.util.ArrayList;

public class LegoMosaicSet extends LegoBrick implements LegoMosaic {
private ArrayList<LegoBrick> brickSet;
public LegoMosaicSet() {
    brickSet = new ArrayList<>();
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
        System.out.println("Size:" + brick.size + " " + "Color:" + brick.color);


    }
}

}
