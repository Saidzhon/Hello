package CalcOOP.CalcInterface;

import java.util.Scanner;

public class CalcInput {

    public float input() {
        float number;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели некоректное значение, попробуйте заново!");
            }

        }

        return number;
    }

}
