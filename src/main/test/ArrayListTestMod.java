package main.test;

import main.java.main.ArrayListPractice;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTestMod {

    @Test
    public void testListSize() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assert.assertEquals(practice.listSize(list), 4);
    }

    @Test
    public void testSumOddList() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(practice.SumOddList(list), 9);
    }

    @Test
    public void testCountAllSevens() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 17, 9, 27));
        Assert.assertEquals(practice.CountAllSevens(list), 3);
    }

    @Test
    public void testAscendList() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 5, 8, 9));
        Assert.assertEquals(practice.AscendList(list), expected);
    }

    @Test
    public void testRemoveAboveFifty() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 55, 23, 67, 45, 89));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(10, 23, 45));
        Assert.assertEquals(practice.RemoveAboveFifty(list), expected);
    }

    @Test
    public void testConvertList() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hi", "hello", "a", "xyz"));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 5, 1, 3));
        Assert.assertEquals(practice.convertList(list), expected);
    }

    @Test
    public void testSumof() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(practice.Sumof(0, list), 15);
    }

    @Test
    public void testMakeRandomList() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> randomList = practice.makeRandomList(5, 10, 20);
        Assert.assertEquals(randomList.size(), 5);
        for (int num : randomList) {
            Assert.assertTrue(num >= 10 && num <= 20);
        }
    }

    @Test
    public void testSpecialSumOfList() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, null, 4, 5));
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(null, "a", "bb", null, "ccc"));
        Assert.assertEquals(practice.SpecialSumOfList(numList, strList), 11);
    }

    @Test
    public void testRemoveDuplicates() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(practice.removeDuplicates(list), expected);
    }

    @Test
    public void testMergeSortedLists() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertEquals(practice.mergeSortedLists(list1, list2), expected);
    }

    @Test
    public void testSecondLargest() {
        ArrayListPractice practice = new ArrayListPractice();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99));
        Assert.assertEquals(practice.secondLargest(list), 45);
    }
}

