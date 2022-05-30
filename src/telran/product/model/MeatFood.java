package telran.product.model;

public class MeatFood extends Food{
    String typeOfMeat;

    public MeatFood(String barCode, String name, double price, boolean kosher, String expDate, String typeOfMeat) {
        super(barCode, name, price, kosher, expDate);
        this.typeOfMeat = typeOfMeat;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }
}
