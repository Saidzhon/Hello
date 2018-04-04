//import com.sun.corba.se.spi.ior.IdentifiableFactory;

import java.io.PrintStream;
import java.util.Scanner;

public class Calculus {

    /** Реазилация кальтулятора*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для запуска калькулятора и 2 для поиска макс массива");
        int key = scanner.nextInt();

        if(key == 1){
            calculator();
        }else if(key == 2){
            Search_Max_Massive.massive();
        }else{
            System.out.println("Введено неправильное значение");
        }
   




    }

    public static void calculator(){
        /*ввод первого числа*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        double firstNumber = scanner.nextDouble();

        /*ввод второго числа*/
        System.out.println("Enter the Second number");
        double secondNumber = scanner.nextDouble();
        int operation;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую желаемой операции");
        System.out.println("1 - Sum");    /*сложение*/
        System.out.println("2 - Sub");    /*вычитание*/
        System.out.println("3 - Mult");   /*умножение*/
        System.out.println("4 - Div");    /*деление*/
        operation = scanner1.nextInt();
        scanner1.close();
        switch (operation) {

            case 1:
                /*отображение результата сложения*/
                System.out.println("Sum is:");
                System.out.printf("%.4f", firstNumber + secondNumber);
                break;

            case 2:
                /*отображение результата вычитания*/
                System.out.println("\nSub is:");
                System.out.printf("%.4f", firstNumber - secondNumber);
                break;
            case 3:
                /*отображение результата умножения*/
                System.out.println("\nMult is:");
                System.out.printf("%.4f", firstNumber * secondNumber);
                break;

            case 4:
                /*отображение результата деления*/
                System.out.println("\nDiv is:");
                System.out.printf("%.4f", firstNumber / secondNumber);
                break;


        }
    }
}