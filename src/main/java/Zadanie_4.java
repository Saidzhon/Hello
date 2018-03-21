import java.util.Random;

public class Zadanie_4 {
    public static void main(String[] args) {
        int[] numbers = new int[21];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(21) -10;   //генерация случайных чисел от -10 до 10

        }
        for (int i = 0; i < numbers.length; i++) {      // вывод сгинерированных чисел
            System.out.println(numbers[i] + "  ");
        }
        int min = numbers[0];                           //отображаение минимума
        for (int i = 0;i< numbers.length; i++)
            if (min >= numbers[i])
                min = numbers[i];

        System.out.println("\nmin =" + min);          //отображаение минимума

        int max = numbers[0];
        for (int i = 0;i< numbers.length; i++)
            if (max < numbers[i])
                max = numbers[i];

        System.out.println("\n max =" + max);
}}

