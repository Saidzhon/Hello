package CalcOOP.CalcOperations;

public abstract class Mult extends CalcOperations implements CalcReports{

    @Override
    public float calculus (float x, float y){
        return x*y;
    }
    public String getSign(){
        String sign = "*";
        return String.valueOf(sign);
    }
}
