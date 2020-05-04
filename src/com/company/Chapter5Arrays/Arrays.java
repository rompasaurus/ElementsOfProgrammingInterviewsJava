package com.company.Chapter5Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays {
    /*
    Array bootcamp:
        Given an array of integers reorder its entries so that the even entries appear first
        Solve this without allocating additional space
     */
    public static void evenOdd(List<Integer> a) {
        int nextEven =0 , nextOdd=a.size()-1;
        while (nextEven < nextOdd) {
            if (a.get(nextEven) % 2 == 0) {
                nextEven++;
            }else{
                Collections.swap(a,nextEven,nextOdd);
                nextOdd--;
            }
        }
        System.out.println("even/odd sorted list: "+ a);
    }
    public static void evenOdd(int[] a) {
        int nextEven =0 , nextOdd=a.length-1;
        while (nextEven < nextOdd) {
            if (a[nextEven] % 2 == 0) {
                nextEven++;
            }else{
               int store = a[nextEven];
               a[nextEven] = a[nextOdd];
               a[nextOdd] = store;
               nextOdd--;
            }
        }
        System.out.print("even/odd sorted list: ");
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    /*
    Sort a given char array with capitals at the start of the array and then lowercase then numbers
     */
    public static void sortChars(char[] cArray) {
        int lower = 0, upper, notLower = cArray.length-1,notUpper = cArray.length-1;
        //First start by swapping all the lowercase chars to the front
        while (lower < notLower) {
            if (cArray[lower] >= 'a') {
                lower++;
            } else {
                char store = cArray[lower];
                cArray[lower] = cArray[notLower];
                cArray[notLower] = store;
                notLower--;
            }
        }
        //upper now has a starting point from where the lower case chars end
        upper = lower;
        while (upper < notUpper) {
            if (cArray[upper] >= 'A'&& cArray[upper] <= 'Z') {
                upper++;
            } else {
                char store = cArray[upper];
                cArray[upper] = cArray[notUpper];
                cArray[notUpper] = store;
                notUpper--;
            }
        }
        System.out.print("Char Array sorted ");
        for (char i : cArray) {
            System.out.print(i+" ");
        }
    }
}
