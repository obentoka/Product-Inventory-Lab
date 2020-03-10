package models;

public class Sock {

    private Integer id;
    private String brand;
    private String sport;
    private String material;
    private String color;
    private Character size;

    public Sock() {
        id = null;
        brand = null;
        sport = null;
        material = null;
        color = null;
        size = null;
    }

    public Sock(Integer id, String brand, String sport, String material, String color, Character size){
        this.id  = id;
        this.brand = brand;
        this.sport = sport;
        this.material = material;
        this.color = color;
        this.size = size;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getSize() {
        return this.size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
