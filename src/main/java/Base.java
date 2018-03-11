import java.io.PrintStream;
import java.util.Scanner;
public class Base {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        System.out.println("Sum is:");
        System.out.print(a + b);
        scanner.close();

    }
}