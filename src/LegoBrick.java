public class LegoBrick {

    private int size;
    private String color;

    private String stud;

    public LegoBrick(int size, String color, String stud) //LegoBrick Object
    {
        this.size = size;
        this.color = color;
        this.stud = stud;
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
