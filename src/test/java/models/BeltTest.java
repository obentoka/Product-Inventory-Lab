package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeltTest {

    int expectedId = 0;
    String expectedBrand = "Levi";
    String expectedBuckle = "Clamp";
    String expectedColor = "Brown";
    int expectedSize = 28;
    float expectedPrice = 20.0f;

    Belt testBelt = new Belt(0, expectedBrand, expectedBuckle, expectedColor,
            expectedSize, expectedPrice);

    @Test
    public void constructorTest1(){
        Belt test = new Belt();
        Assertions.assertNull(test.getId());
        Assertions.assertNull(test.getBrand());
        Assertions.assertNull(test.getBuckle());
        Assertions.assertNull(test.getColor());
        Assertions.assertNull(test.getSize());
        Assertions.assertNull(test.getPrice());
    }

    @Test
    public void constructorTest2(){
        Assertions.assertEquals(expectedId, testBelt.getId());
        Assertions.assertEquals(expectedBrand, testBelt.getBrand());
        Assertions.assertEquals(expectedBuckle, testBelt.getBuckle());
        Assertions.assertEquals(expectedColor, testBelt.getColor());
        Assertions.assertEquals(expectedSize, testBelt.getSize());
        Assertions.assertEquals(expectedPrice, testBelt.getPrice());
    }

    @Test
    public void constructorTest3(){
        Belt test = Belt.BeltBuilder.newInstance()
                .setBrand("Levi")
                .setColor("Brown")
                .setId(0)
                .setPrice(20.0f)
                .setBuckle("Clamp")
                .setSize(28)
                .build();

        Assertions.assertEquals(expectedId, test.getId());
        Assertions.assertEquals(expectedBrand, test.getBrand());
        Assertions.assertEquals(expectedBuckle, test.getBuckle());
        Assertions.assertEquals(expectedColor, test.getColor());
        Assertions.assertEquals(expectedSize, test.getSize());
        Assertions.assertEquals(expectedPrice, test.getPrice());
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

    @Test
    public void setIdTest(){
        testBelt.setId(expectedId);
        Assertions.assertEquals(expectedId, testBelt.getId());
    }

    @Test
    public void getIdTest(){
        testBelt.setId(expectedId);
        Assertions.assertEquals(expectedId, testBelt.getId());
    }
}
