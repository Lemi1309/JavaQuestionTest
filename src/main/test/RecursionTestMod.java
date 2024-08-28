package main.test;

import main.java.main.Recursion;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecursionTestMod {

    @Test
    public void testSumof() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.Sumof(10), 55);
        Assert.assertEquals(recursion.Sumof(1), 1);
        Assert.assertEquals(recursion.Sumof(0), 0);
    }

    @Test
    public void testSumOdd() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.SumOdd(10), 25);
        Assert.assertEquals(recursion.SumOdd(15), 64);
    }

    @Test
    public void testSumEven() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.SumEven(10), 30);
        Assert.assertEquals(recursion.SumEven(15), 56);
    }

    @Test
    public void testCountFours() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.CountFours(44246), 3);
        Assert.assertEquals(recursion.CountFours(1234), 1);
        Assert.assertEquals(recursion.CountFours(56789), 0);
    }

    @Test
    public void testSumOfAllFours() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.SumOfAllFours(4424), 4852);
    }

    @Test
    public void testSumArray() {
        Recursion recursion = new Recursion();
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertEquals(recursion.sumArray(0, array), 15);
    }

    @Test
    public void testSumStringArray() {
        Recursion recursion = new Recursion();
        String[] array = {"hi", "hello", "monkey"};
        Assert.assertEquals(recursion.sumStringArray(0, array), 13);
    }

    @Test
    public void testCountOddInArray() {
        Recursion recursion = new Recursion();
        int[] array = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(recursion.countOddInArray(0, array), 3);
    }

    @Test
    public void testFactorial() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.factorial(5), 120);
        Assert.assertEquals(recursion.factorial(0), 1);
        Assert.assertEquals(recursion.factorial(1), 1);
    }

    @Test
    public void testFibonacci() {
        Recursion recursion = new Recursion();
        Assert.assertEquals(recursion.fibonacci(6), 8);
        Assert.assertEquals(recursion.fibonacci(0), 0);
        Assert.assertEquals(recursion.fibonacci(1), 1);
        Assert.assertEquals(recursion.fibonacci(10), 55);
    }
}

