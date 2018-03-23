package Sweets;

public class Candy extends Sweets {
    private String size;

    public Candy(String brand, Double price, Double weight, String size) {
        super(brand, price, weight);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", size =" + size+ "]";
    }
}
