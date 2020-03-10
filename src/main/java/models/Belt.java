package models;

public class Belt {

    private Integer id;
    private String brand;
    private String buckle;
    private String color;
    private Integer size;
    private Float price;

    public Belt() {
        id = null;
        brand = null;
        buckle = null;
        color = null;
        size = null;
        price = null;
    }

    public Belt(Integer id, String brand, String buckle, String color, Integer size, Float price){
        this.id  = id;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
