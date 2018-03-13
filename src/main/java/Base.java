import java.io.PrintStream;
import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        /*ввод первого числа*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        double a = scanner.nextDouble();

        /*ввод второго числа*/
        System.out.println("Enter the Second number");
        double b = scanner.nextDouble();

        /*отображение результата*/
        System.out.println("Sum is:");
        System.out.printf("%.4f",a + b);
        scanner.close();

    }
}