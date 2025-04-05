import static java.lang.Math.*;

public class StaticImportExample {
    public static void main(String[] args) {
        double result = sqrt(25); 
        System.out.println("Square root of 25 is: " + result);
        
        double piValue = PI; 
        System.out.println("Value of PI is: " + piValue);
    }
}
