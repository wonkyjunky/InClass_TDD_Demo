package com.example.inclass_tdd_demo;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void mulitplication_isCorrect() {
        Random r = new Random();
        int x = r.nextInt();
        int y = r.nextInt();
        assertEquals(x*y, Utils.mulit(x,y));
        assertNotEquals(x*y+1, Utils.mulit(x,y));
    }
}