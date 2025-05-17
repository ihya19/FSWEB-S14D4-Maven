package org.example.model;

public class Coke extends ProductForSale{
    private String flavor;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String flavor) {
        super(type, price, description);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Adı: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Aroması: " + getFlavor());
    }
}
