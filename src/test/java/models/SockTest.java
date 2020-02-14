package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SockTest {

    String expectedBrand = "Nike";
    String expectedSport = "Football";
    String expectedMaterial = "Cotton";
    String expectedColor = "White";
    char expectedSize = 'M';
    Sock testSock = new Sock(expectedBrand, expectedSport, expectedMaterial,
            expectedColor, expectedSize);
    @Test
    public void constructorTest(){

        Assertions.assertEquals(expectedBrand, testSock.getBrand());
        Assertions.assertEquals(expectedColor, testSock.getSport());
        Assertions.assertEquals(expectedMaterial, testSock.getMaterial());
        Assertions.assertEquals(expectedColor, testSock.getColor());
        Assertions.assertEquals(expectedSize, testSock.getSize());
    }
    @Test
    public void setBrandTest(){
        testSock.setBrand(expectedBrand);
        Assertions.assertEquals(expectedBrand, testSock.getBrand());
    }
    @Test
    public void getBrandTest(){
        testSock.setBrand(expectedBrand);
        Assertions.assertEquals(expectedBrand, testSock.getBrand());
    }
    @Test
    public void setSportTest(){
        testSock.setSport(expectedSport);
        Assertions.assertEquals(expectedSport, testSock.getSport());
    }
    @Test
    public void getSportTest(){
        testSock.setSport(expectedSport);
        Assertions.assertEquals(expectedSport, testSock.getSport());
    }
    @Test
    public void setMaterialTest(){
        testSock.setMaterial(expectedMaterial);
        Assertions.assertEquals(expectedMaterial, testSock.getMaterial());
    }
    @Test
    public void getMaterialTest(){
        testSock.setColor(expectedMaterial);
        Assertions.assertEquals(expectedMaterial, testSock.getMaterial());
    }
    @Test
    public void setColorTest(){
        testSock.setColor(expectedColor);
        Assertions.assertEquals(expectedColor, testSock.getColor());
    }
    @Test
    public void getColorTest(){
        testSock.setColor(expectedSport);
        Assertions.assertEquals(expectedColor, testSock.getColor());
    }
    @Test
    public void setSizeTest(){
        testSock.setSize(expectedSize);
        Assertions.assertEquals(expectedSize, testSock.getSize());
    }
    @Test
    public void getSizeTest(){
        testSock.setSize(expectedSize);
        Assertions.assertEquals(expectedSize, testSock.getSize());
    }

}
