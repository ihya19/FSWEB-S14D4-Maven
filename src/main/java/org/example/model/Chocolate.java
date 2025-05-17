package org.example.model;

public class Chocolate extends ProductForSale{
    private String kind;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String kind) {
        super(type, price, description);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Adı: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Türü: " + getKind());
    }
}
