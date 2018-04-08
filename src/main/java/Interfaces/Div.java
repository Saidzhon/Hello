package Interfaces;

public class Div implements Info {
    private double firstNumber;
    private double secondNumber;

    public Div(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void divResult() {
        System.out.printf("%.4f", firstNumber / secondNumber);
    }

    @Override
    public void showInfo() {
        System.out.println("\nDiv is:");
        System.out.printf("%.4f",firstNumber / secondNumber);

    }
}
