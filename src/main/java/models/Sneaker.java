package models;

public class Sneaker {
    int id;
    String name;
    String brand;
    String sport;
    float size;
    int qty;
    float price;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBrand(String name){
        this.brand = name;
    }

    public String getBrand(){
        return this.brand;
    }
}
