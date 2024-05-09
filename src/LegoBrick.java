public class LegoBrick {

    public int size;
    public String color;





    public LegoBrick(int size, String color) //LegoBrick Object
    {
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }


//^^ all the getters/setters
}
