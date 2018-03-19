import java.util.Scanner;
/**Поиск максимального массива*/
public class Search_Max_Massive {

    static Scanner maxWord = new Scanner(System.in);
    static int massLength;
    static String[] mass;

    public static void main(String[] args) {
      massive();

        }
    private static void massive(){

        inputMassLength();
        inputWords();
        maxWordSearch();
    }

    private static void inputMassLength() {
        while (true) {
            try {
                Scanner masScan = new Scanner(System.in);
                System.out.println("Введите размер массива");
                massLength = masScan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }
        mass = new String[massLength];
    }


    private static void inputWords() {
        System.out.println("Введите слова, равные кол-ву массивов");
        for (int x = 0; x < massLength; x++) {
            System.out.printf("Введите слово(а) массива", x);
            System.out.println("");
            mass[x] = maxWord.nextLine();
        }
    }

    private static void maxWordSearch() {
        String maxWord = mass[0];
        for (int i = 1; i < massLength; i++) {
            if (mass[i].length() > maxWord.length()) {
                maxWord = mass[i];
            }
        }
        System.out.print("Самое длинное слово: " + maxWord);
    }
}