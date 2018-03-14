import java.io.PrintStream;
import java.util.Scanner;

public class Base {

    /** Реазилация кальтулятора*/

    public static void main(String[] args) {
        /*ввод первого числа*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        double a = scanner.nextDouble();

        /*ввод второго числа*/
        System.out.println("Enter the Second number");
        double b = scanner.nextDouble();

        /*отображение результата сложения*/
        System.out.println("Sum is:");
        System.out.printf("%.4f",a + b);

        /*отображение результата вычитания*/
        System.out.println("\nSub is:");
        System.out.printf("%.4f",a - b);

        /*отображение результата умножения*/
        System.out.println("\nMult is:");
        System.out.printf("%.4f",a * b);

        /*отображение результата деления*/
        System.out.println("\nDiv is:");
        System.out.printf("%.4f",a / b);

        scanner.close();

    }
}