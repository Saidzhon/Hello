package CalcOOP;
import CalcOOP.CalcInterface.CalcInput;

public class CalcMain {
    public static void main(String[] args) {
        Calc calculus = new Calc();
        calculus.setFirstNumber();
        calculus.setSecondNumber();
        calculus.operation();
        calculus.CalcReports();
    }
}
