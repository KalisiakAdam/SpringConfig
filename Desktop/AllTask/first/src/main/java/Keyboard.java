import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Keyboard {
    private final Logger logger = Logger.getLogger(getClass().getName());

    public int keyboardNumber(Scanner sc) {

        int number = 0;
        try {
            if (sc.hasNext()) {
                number = sc.nextInt();
                return number;
            }
        }
        catch(InputMismatchException e) {
            logger.log(Level.WARNING, "Only numbers are allowed here -> " + e);
            sc.nextLine();
            number = keyboardNumber(sc);
        }
        return number;
    }
}
