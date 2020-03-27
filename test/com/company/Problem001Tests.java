package com.company;

import junit.framework.TestCase;

public class Problem001Tests extends TestCase {

    public void testNull() {
        int listOfNumbers[] = null;
        int k = 17;

        assertFalse(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testEmptyArray() {
        int listOfNumbers[] = {};
        int k = 17;

        assertFalse(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testProvidedExample() {
        int listOfNumbers[] = {10, 15, 3, 7};
        int k = 17;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testSingleNumber() {
        int listOfNumbers[] = {17};
        int k = 17;

        assertFalse(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testSingleNumberEven() {
        int listOfNumbers[] = {5};
        int k = 10;

        assertFalse(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testOnlyTwoNumbers() {
        int listOfNumbers[] = {1, 16};
        int k = 17;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testTwoNumbersNonAdjacent() {
        int listOfNumbers[] = {1, 2, 3, 16};
        int k = 17;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testTwoNumbersNonAdjacent2() {
        int listOfNumbers[] = {1,2,3,4,5,14,16,21,23,25};
        int k = 17;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testNoSolutionPresent() {
        int listOfNumbers[] = {2,2,4,5,14,16,21,23,25};
        int k = 17;

        assertFalse(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testTwoEvenNumbers() {
        int listOfNumbers[] = {2,2,4,5,14,16,21,23,25};
        int k = 4;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }

    public void testOneNumberIsZero() {
        int listOfNumbers[] = {0,2,4,5,14,17,21,23,25};
        int k = 17;

        assertTrue(Problem001.findSumOf(k, listOfNumbers));
    }
}
