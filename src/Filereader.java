import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;
public class Filereader {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name you want to read : ");
        String file = input.next();
        int red = 0;
        try (FileReader reader = new FileReader(file)) {
            do {
                red = reader.read();
                System.out.print((char) red);
            } while (red != -1);


        } catch (IOException exception) {
            if (exception.getMessage().equals(file + " (No such file or directory)")) {
                System.out.println("your file is missing");
            } else {
                throw exception;
            }
        }
        finally {
            System.out.println("i am in final block");
        }

    }

}

