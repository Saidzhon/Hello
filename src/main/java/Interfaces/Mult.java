package Interfaces;

public class Mult implements Info{
    private double firstNumber;
    private double secondNumber;

    public Mult(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void multResult() {
        System.out.printf("%.4f", firstNumber * secondNumber);
    }

    @Override
    public void showInfo() {
        System.out.println("\nMult is:");
        System.out.printf("%.4f",firstNumber * secondNumber);

    }
}

