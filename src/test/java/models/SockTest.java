package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SockTest {

    int expectedId = 0;
    String expectedBrand = "Nike";
    String expectedSport = "Football";
    String expectedMaterial = "Cotton";
    String expectedColor = "White";
    char expectedSize = 'M';

    Sock testSock = new Sock(expectedId, expectedBrand, expectedSport, expectedMaterial,
            expectedColor, expectedSize);

    @Test
    public void constructorTest1(){
        Sock test = new Sock();
        Assertions.assertNull(test.getId());
        Assertions.assertNull(test.getBrand());
        Assertions.assertNull(test.getSport());
        Assertions.assertNull(test.getMaterial());
        Assertions.assertNull(test.getColor());
        Assertions.assertNull(test.getSize());
    }

    @Test
    public void constructorTest2(){

        Assertions.assertEquals(expectedBrand, testSock.getBrand());
        Assertions.assertEquals(expectedSport, testSock.getSport());
        Assertions.assertEquals(expectedMaterial, testSock.getMaterial());
        Assertions.assertEquals(expectedColor, testSock.getColor());
        Assertions.assertEquals(expectedSize, testSock.getSize());
    }

    @Test
    public void constructorTest3(){
        Sock test = Sock.SockBuilder.newInstance()
                .setBrand("Nike")
                .setSport("Football")
                .setId(0)
                .setMaterial("Cotton")
                .setColor("White")
                .setSize('M')
                .build();

        Assertions.assertEquals(expectedId, test.getId());
        Assertions.assertEquals(expectedBrand, test.getBrand());
        Assertions.assertEquals(expectedSport, test.getSport());
        Assertions.assertEquals(expectedMaterial, test.getMaterial());
        Assertions.assertEquals(expectedColor, test.getColor());
        Assertions.assertEquals(expectedSize, test.getSize());
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
        testSock.setColor(expectedColor);
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

    @Test
    public void setIdTest(){
        testSock.setId(expectedId);
        Assertions.assertEquals(expectedId, testSock.getId());
    }
    @Test
    public void getIdTest(){
        testSock.setId(expectedId);
        Assertions.assertEquals(expectedId, testSock.getId());
    }

}
