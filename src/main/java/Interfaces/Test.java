package Interfaces;

public class Test {
    public static void main(String[] args) {
    Info info1 = new Sum(27, 13);
    Info info2 = new Sub(44, 11);
    Info info3 = new Mult(7, 7);
    Info info4 = new Div(9, 3);
    info1.showInfo();
    info2.showInfo();
    info3.showInfo();
    info4.showInfo();

    }
}
