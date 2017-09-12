import java.util.Scanner;



public class App {
    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard();
        int clientNumber = keyboard.keyboardNumber(new Scanner(System.in));
        System.out.println("My number is: " + clientNumber);

        Factorial factorial = new Factorial();
        int factorialNumber = factorial.factorial(clientNumber);
        System.out.println("Factorial is: " + factorialNumber);
    }
}
