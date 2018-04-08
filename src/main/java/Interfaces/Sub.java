package Interfaces;

public class Sub implements Info {
    private double firstNumber;
    private double secondNumber;

    public Sub(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void subResult() {
        System.out.printf("%.4f", firstNumber - secondNumber);
    }

    @Override
    public void showInfo() {
        System.out.println("\nSub is:");
        System.out.printf("%.4f",firstNumber - secondNumber);

    }
}