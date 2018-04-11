package Lesson6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path =separator + "C:" +separator+ "Users" +separator+ "user" +separator+ "Desktop" +separator+ "test.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line  =scanner.nextLine();
        System.out.println("---------------прочтенные слова из файла---------------");
        System.out.println(line);

        String sortline =line;

        List<String> lineList = Arrays.asList(sortline.split(" "));
        Collections.sort(lineList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });

        System.out.println("---------------Слова из файла сортированные по алфавиту---------------");
        for(int i = 0; i < lineList.size(); i++){

            System.out.print(lineList.get(i) + " ");
        }

        HashMap<String, Integer> statisticOfWord = new HashMap<String, Integer>();
        for (String a: lineList) {
          int index = 0;
            if(statisticOfWord.containsKey(a))
                index = statisticOfWord.get(a);

            statisticOfWord.put(a, index + 1);

        }
        System.out.println("\nПовторения слов:");
        for (String с : statisticOfWord.keySet()) {
            System.out.println("Слово " + с + " повторилось " + statisticOfWord.get(с) + " раз.");
        }


        Integer max = 0;
        String maxKey = "";
        for(String key : statisticOfWord.keySet()){
            Integer value = statisticOfWord.get(key);
            if(value > max){
                max = value;
                maxKey = key;
            }
        }

        System.out.println("Макс количество повторений =" + statisticOfWord.get(maxKey));
        System.out.println("Слово, которое повторилось больше всех = " + maxKey);

        scanner.close();
    }
}
