import java.util.Scanner;

public class Arithematicexception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers on which you have to perform operation");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            int div = num1 / num2;

        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("please choose any other digit rather than zero");
            } else {
                throw exception;
            }

        }


    }
}