import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args) {
        String fileName = "shikhar.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("this is the best java file ever created");
        }catch(IOException exception ){
            System.out.println("you file cannot be accessed");
        }
    }
}
