package services;

import models.Belt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeltServicesTest {

    String expectedBrand = "Levi";
    String expectedBuckle = "Clamp";
    String expectedColor = "Brown";
    int expectedSize = 28;
    float expectedPrice = 20.0f;
    BeltService testBeltService;
    Belt testBelt;

    @BeforeEach
    public void init(){
        testBeltService = new BeltService();
        testBelt = testBeltService.create(expectedBrand,expectedBuckle,
                expectedColor, expectedSize, expectedPrice);
    }

    @Test
    public void createTest(){
        testBeltService = new BeltService();
        testBelt = testBeltService.create(expectedBrand,expectedBuckle,
                expectedColor, expectedSize, expectedPrice);

        Assertions.assertEquals(expectedBrand, testBelt.getBrand());
        Assertions.assertEquals(expectedBuckle, testBelt.getBuckle());
        Assertions.assertEquals(expectedColor, testBelt.getColor());
        Assertions.assertEquals(expectedSize, testBelt.getSize());
        Assertions.assertEquals(expectedPrice, testBelt.getPrice());
    }

    @Test
    public void findTest(){
        testBelt = testBeltService.create(expectedBrand,expectedBuckle,
                expectedColor, expectedSize, expectedPrice);
        Belt actual = testBeltService.findBelt(1);

        Assertions.assertEquals(testBelt, actual);
    }

    @Test
    public void findAllTest(){
        Belt testBelt2 = Belt.BeltBuilder.newInstance()
                        .setBrand("d").setBuckle("e").setColor("c")
                        .setPrice(10f).setSize(28).build();
        Belt testBelt3 = Belt.BeltBuilder.newInstance()
                .setBrand("a").setBuckle("x").setColor("f")
                .setPrice(10f).setSize(8).build();
        Belt expected1 = testBeltService.create(testBelt2);
        Belt expected2 = testBeltService.create(testBelt3);

        Belt[] expected = new Belt[]{expected1, expected2};

        Belt[] actual = testBeltService.findAll();

        for (int i = 0; i < actual.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test void delteTest(){
        Belt testBelt2 = Belt.BeltBuilder.newInstance()
                .setBrand("d").setBuckle("e").setColor("c")
                .setPrice(10f).setSize(28).build();
        Belt testBelt3 = Belt.BeltBuilder.newInstance()
                .setBrand("a").setBuckle("x").setColor("f")
                .setPrice(10f).setSize(8).build();
        testBeltService.create(testBelt2);
        testBeltService.create(testBelt3);
        testBeltService.delete(2);

        Belt[] expected = new Belt[]{testBelt2};

        Belt[] actual = testBeltService.findAll();

        Assertions.assertEquals(expected[0], actual[0]);
    }
}
