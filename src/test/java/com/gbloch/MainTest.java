package com.gbloch;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test1() {
        System.out.println("##############################");
        System.out.println(System.getenv("TEST_HOST"));
        System.out.println("##############################");
    }
}
