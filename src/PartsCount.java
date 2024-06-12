import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PartsCount{



    public int parts;


    public PartsCount(int parts){
        this.parts = parts;
    }



    public int displayParts() {
        return parts;}

public void incrementParts(){
    parts++;
    updatePartsFile();
    }

    private void updatePartsFile(){
        try {
            FileWriter partwriter = new FileWriter("Parts.txt");
            partwriter.write(String.valueOf(parts));
            partwriter.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }




    }

