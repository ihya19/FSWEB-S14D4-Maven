package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Milka", 25.0, "Fındıklı sütlü çikolata","Bitter");
        products[1] = new Coke("Coca Cola", 15.0, "Soğuk içecek, 330ml","Strawberry");
        products[2] = new Bread("Tam Buğday Ekmeği", 10.0, "Taze fırın ekmeği",4);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("------------------------");
        }
    }
}
