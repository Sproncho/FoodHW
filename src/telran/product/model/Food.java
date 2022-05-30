package telran.product.model;

public class Food extends Product{
    boolean kosher;
    String expDate;

    public Food(String barCode, String name, double price, boolean kosher, String expDate) {
        super(barCode, name, price);
        this.kosher = kosher;
        this.expDate = expDate;
    }

    public boolean isKosher() {
        return kosher;
    }

    public void setKosher(boolean kosher) {
        this.kosher = kosher;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
