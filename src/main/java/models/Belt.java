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

    public Belt(BeltBuilder belt){
        this.id  = belt.id;
        this.brand = belt.brand;
        this.buckle = belt.buckle;
        this.color = belt.color;
        this.size = belt.size;
        this.price = belt.price;
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

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class BeltBuilder {
        private Integer id;
        private String brand;
        private String buckle;
        private String color;
        private Integer size;
        private Float price;

        private BeltBuilder(){};

        public static BeltBuilder newInstance(){
            return new BeltBuilder();
        }

        public BeltBuilder setId(Integer id){
            this.id = id;
            return this;
        }

        public BeltBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public BeltBuilder setBuckle(String buckle){
            this.buckle = buckle;
            return this;
        }

        public BeltBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public BeltBuilder setSize(Integer id){
            this.size = size;
            return this;
        }

        public BeltBuilder setPrice(Float price){
            this.price = price;
            return this;
        }

        public Belt build(){
            return new Belt(this);
        }
    }
}
