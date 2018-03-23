import Sweets.Candy;
import Sweets.Jellybean;
import Sweets.Cookie;
import Sweets.Sweets;


public class Zadanie_4_2 {

    public static void main(String[] args) {
        Jellybean jellybean = new Jellybean("Skittles", 6.99, 50.50, "Red");
        Cookie cookie = new Cookie("Oreo", 12.89, 350.67, "Cookie with Choko");
        Candy candy1 = new Candy("M&M's", 5.59, 75.99, "Medium");
        Candy candy2 = new Candy("KitKat", 6.09, 68.00,"King size" );
        Sweets[] box = {cookie, jellybean, candy1, candy2};

        for (Sweets someSweets: box) {
            System.out.println(someSweets.toString());
        }

        /** Реализация общей суммы подарка*/
        Double summ = 3.d;
        for(int i = 0; i<box.length; i++){
            summ += box[i].getPrice();
        }
        System.out.println("Общая стоимость=");
        System.out.println(summ);

        /** Реализация общего веса подарка*/
        Double sum = 0.d;
        for(int i = 0; i<box.length; i++) {
            sum +=box[i].getWeight();
        }
        System.out.println("Общий вес=");
        System.out.println(sum);
    }
}
