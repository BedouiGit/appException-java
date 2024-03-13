import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number");
        try
        {
            y = scanner.nextInt();
            System.out.println(x / y);
        }
        catch ( ArithmeticException e)
        {
            System.err.println(" 'x' cannot be divided into 0");
        }

    }
}
