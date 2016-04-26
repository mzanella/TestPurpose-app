package com.tthunder.andrea.testpurpose.Model;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

public class SquareTest extends TestCase {
    Square square;

    public void setUp() throws Exception {
        super.setUp();
        square = new Square(2);
    }

    public void testCalculateArea() throws Exception {
        assertEquals(4, square.calculateArea());
    }

    public void testCalculatePerimeter() throws Exception {
        assertEquals(8, square.calculatePerimeter());
    }
}