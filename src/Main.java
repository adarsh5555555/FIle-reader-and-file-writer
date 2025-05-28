import java.util.Calendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        plane myplane = new plane();
        Car myCar = new Car();
        poly(myCar);
        poly(myplane);




    }
    public static void poly(Vechile vech){
        vech.start();
    }
}