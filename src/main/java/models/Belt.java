package models;

public class Belt {

    private String brand;
    private String buckle;
    private String color;
    private int size;
    private float price;

    public Belt() {
    }

    public Belt(String brand, String buckle, String color, int size, float price){
        this.brand = brand;
        this.buckle = buckle;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getBuckle() {
        return buckle;
    }

    public void setBuckle(String buckle) {
        this.buckle = buckle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
