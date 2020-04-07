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

    public Sock(SockBuilder sock){
        this.id  = sock.id;
        this.brand = sock.brand;
        this.sport = sock.sport;
        this.material = sock.material;
        this.color = sock.color;
        this.size = sock.size;
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

    public static class SockBuilder {
        private Integer id;
        private String brand;
        private String sport;
        private String material;
        private String  color;
        private Character size;

        private SockBuilder(){};

        public static SockBuilder newInstance(){
            return new SockBuilder();
        }

        public SockBuilder setId(Integer id){
            this.id = id;
            return this;
        }

        public SockBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public SockBuilder setSport(String sport){
            this.sport = sport;
            return this;
        }

        public SockBuilder setMaterial(String material){
            this.material = material;
            return this;
        }

        public SockBuilder setColor(String color){
            this.color = color;
            return this;
        }

        public SockBuilder setSize(Character size){
            this.size = size;
            return this;
        }

        public Sock build(){
            return new Sock(this);
        }
    }
}
