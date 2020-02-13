package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Tennis";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }
}
