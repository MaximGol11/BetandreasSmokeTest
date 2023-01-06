package test;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FakeTests {

    @Test
    void someTest() {
        assertTrue(true);
    }

    @Test
    void some1Test() {
        assertTrue(true);
    }

    @Test
    void some2Test() {
        assertTrue(true);
    }

    @Test
    void some3Test() {
        assertTrue(true);
    }

    @Test
    void some4Test() {
        assertTrue(true);
    }

    @Test
    void some5Test() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void some6Test() {
        assertTrue(false);
    }



}
