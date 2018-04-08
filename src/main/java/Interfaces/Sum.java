package Interfaces;

public class Sum implements Info{

    private double firstNumber;
    private double secondNumber;

    public Sum(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void sumResult(){
        System.out.printf("%.4f", firstNumber + secondNumber);
    }

    public void showInfo(){
        System.out.println("Sum is:");
        System.out.printf("%.4f", firstNumber + secondNumber);
    }
}

