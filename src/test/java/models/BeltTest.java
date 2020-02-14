package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

public class BeltTest {

    String expectedBrand = "Levi";
    String expectedBuckle = "Clamp";
    String expectedColor = "Brown";
    int expectedSize = 28;
    float expectedPrice = 20.0f;

    Belt testBelt = new Belt();

    @Test
    public void constructorTest(){

        Belt test2Belt = new Belt(expectedBrand, expectedBuckle, expectedColor,
                expectedSize, expectedPrice);

        Assertions.assertEquals(expectedBrand, test2Belt.getBrand());
        Assertions.assertEquals(expectedBuckle, test2Belt.getBuckle());
        Assertions.assertEquals(expectedColor, test2Belt.getColor());
        Assertions.assertEquals(expectedSize, test2Belt.getSize());
        Assertions.assertEquals(expectedPrice, test2Belt.getPrice());
    }

    @Test
    public void setBrandTest(){
        testBelt.setBrand(expectedBrand);
        Assertions.assertEquals(expectedBrand, testBelt.getBrand());
    }

    @Test
    public void getBrandTest(){
        testBelt.setBrand(expectedBrand);
        Assertions.assertEquals(expectedBrand, testBelt.getBrand());
    }

    @Test
    public void setBuckleTest(){
        testBelt.setBuckle(expectedBuckle);
        Assertions.assertEquals(expectedBuckle, testBelt.getBuckle());
    }

    @Test
    public void getBuckleTest(){
        testBelt.setBuckle(expectedBuckle);
        Assertions.assertEquals(expectedBuckle, testBelt.getBuckle());
    }

    @Test
    public void setColorTest(){
        testBelt.setColor(expectedColor);
        Assertions.assertEquals(expectedColor, testBelt.getColor());
    }

    @Test
    public void getColorTest(){
        testBelt.setColor(expectedColor);
        Assertions.assertEquals(expectedColor, testBelt.getColor());
    }

    @Test
    public void setSizeTest(){
        testBelt.setSize(expectedSize);
        Assertions.assertEquals(expectedSize, testBelt.getSize());
    }

    @Test
    public void getSizeTest(){
        testBelt.setSize(expectedSize);
        Assertions.assertEquals(expectedSize, testBelt.getSize());
    }

    @Test
    public void setPriceTest(){
        testBelt.setPrice(expectedPrice);
        Assertions.assertEquals(expectedPrice, testBelt.getPrice());
    }

    @Test
    public void getPriceTest(){
        testBelt.setPrice(expectedPrice);
        Assertions.assertEquals(expectedPrice, testBelt.getPrice());
    }
}
