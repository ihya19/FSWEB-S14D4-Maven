package org.example.model;

public class Bread extends ProductForSale{
    private int slice;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, int slice) {
        super(type, price, description);
        this.slice = slice;
    }

    public int getSlice() {
        return slice;
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Adı: " + getType());
        System.out.println("Fiyat: " + getPrice() + " TL");
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Dilim sayısı: " + getSlice());

    }
}
