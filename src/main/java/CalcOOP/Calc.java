package CalcOOP;//import com.sun.corba.se.spi.ior.IdentifiableFactory;


import CalcOOP.CalcInterface.CalcInput;
import CalcOOP.CalcOperations.Sum;
import CalcOOP.CalcOperations.Sub;
import CalcOOP.CalcOperations.Div;
import CalcOOP.CalcOperations.Mult;
import CalcOOP.CalcOperations.CalcReports;
import CalcOOP.CalcOperations.CalcOperations;

public class Calc {
private float firstNumber;
private float secondNumber;
private Sub operationNumber;
private CalcReports CalcOperations;


public Calc(){
    }

    public void setFirstNumber(float firstNumber) {
        System.out.println("Введите первое значение");
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(float secondNumber) {
        System.out.println("Введите второе значение");
        this.secondNumber = secondNumber;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

   private void setOperationNumber() {
       CalcInput calcInput = new CalcInput();
       System.out.println("Введите цифру, соответствующую для выбора операции");
       System.out.println("1 - Sum(Сложение)");
       System.out.println("2 - Sub(Вычитание)");
       System.out.println("3 - Mult(Умножение)");
       System.out.println("4 - Div(Деление)");
       this.operationNumber = calcInput.input();
   }

   public void operation(){
    setOperationNumber();
    switch (operationNumber){
        case 1:
            this.CalcOperations = new Sum();
            break;
        case 2:
            this.CalcOperations = new Sub();
            break;
        case 3:
            this.CalcOperations = new Mult();
            break;
        case 4:
            this.CalcOperations= new Div();
            break;
            default:
                System.out.println("Введено неправильное значение");
                operation();
    }}
    private float getCalcOperationReport() {
        return CalcOperations.calculus(firstNumber, secondNumber);
    }
    public void CalcReports(){
        System.out.println(String.format(("%.4f %s %.4f = %.4f", firstNumber, operationNumber.getSign(), secondNumber, CalcOperations()));
}
}

}
