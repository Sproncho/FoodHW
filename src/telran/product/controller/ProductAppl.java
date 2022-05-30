package telran.product.controller;

import telran.product.model.Food;
import telran.product.model.MeatFood;
import telran.product.model.MilkFood;
import telran.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Product("12422","bicycle",1234);
        products[1] = new Food("11882","pepperoni",25,false,"12/05/2023");
        products[2] = new MilkFood("12342","Gil",1.24,true,"12/04/2022","Cow Milk",1);
        products[3] = new MeatFood("223445","Kolbasa",24,false,"15/05/2022","pig meat");
        System.out.println(calcSumPrice(products));

    }
    private static double calcSumPrice(Product[] products){
        double res = 0;
        for (int i = 0; i < products.length; i++) {
            res += products[i].getPrice();
        }
        return res;
    }
}
