package models;

import com.sun.tools.corba.se.idl.StringGen;

public class Sneaker {
    int id;
    String name;
    String brand;
    String sport;
    float size;
    int qty;
    float price;

    public Sneaker(){

    }

    public Sneaker(int  id, String name, String brand, String sport, int qty, float price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.sport = sport;
        this.qty = qty;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getID(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return this.sport;
    }

    public void setSize(float size){
        this.size = size;
    }

    public float getSize(){
        return this.size;
    }

    public void setQuantity(int quantity){
        this.qty = quantity;
    }

    public int getQuantity(){
        return this.qty;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }
}
