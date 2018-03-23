package Sweets;

public class Cookie extends Sweets {
    private String type;

    public Cookie(String brand, Double price, Double weight, String type) {
        super(brand, price, weight);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cookie[" + super.toString()+ ",type =" + type + "]";
    }
}
