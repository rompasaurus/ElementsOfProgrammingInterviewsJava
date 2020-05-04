package com.company;

import com.company.Chapter5Arrays.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        testEvenOdd();
        testSortChars();

    }
    public static void testEvenOdd() {
        List<Integer> iList = new ArrayList<Integer>(){{
            add(2);add(23);add(21);add(43);add(3);add(123);add(13);add(2);add(98);add(13);
        }};
        int[] iArray = {2,1,5,7,5,89,3,24,33};
        Arrays.evenOdd(iList);
        Arrays.evenOdd(iArray);
    }
    public static void testSortChars() {
        char[] cArray = {'a','3','B','c','4','9','Q','F','G'};
        Arrays.sortChars(cArray);
    }
}
