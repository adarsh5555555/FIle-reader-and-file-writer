import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereader {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name that you want to read :");
        String fileName = input.next();
        int red;
        try(FileReader reader = new FileReader(fileName)){
        do{
            red = reader.read();
            System.out.print((char)red);
        }while(red!=-1);

        }
        catch (IOException exception){
            if(exception.getMessage().equals(fileName+" (No such file or directory)")){
                System.out.println("file is missing in the system");
            }else{
                throw exception;
            }
        }
    }
}