package telran.product.model;

public class MilkFood extends Food{
    String typeOfMilk;
    double fatness;

    public MilkFood(String barCode, String name, double price, boolean kosher, String expDate, String typeOfMilk, double fatness) {
        super(barCode, name, price, kosher, expDate);
        this.typeOfMilk = typeOfMilk;
        this.fatness = fatness;
    }

    public String getTypeOfMilk() {
        return typeOfMilk;
    }

    public void setTypeOfMilk(String typeOfMilk) {
        this.typeOfMilk = typeOfMilk;
    }

    public double getFatness() {
        return fatness;
    }

    public void setFatness(int fatness) {
        this.fatness = fatness;
    }
}
