import java.util.Scanner;

public class Booknotfoundexception {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.print("enter the numbers on which you have to apply the operation :");
        int num1 = input.nextInt();
        int num2  = input.nextInt();
        try {
            int c = myArray[6];
            System.out.println(c);

       int div = num1 / num2;
            System.out.println("result : " + div);
    //    } catch (ArithmeticException exception) {
     //       System.out.println("divided by zero");

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("array index is out of bounce");
        }
        finally {
            System.out.println("i am in finally");
        }



    }
}