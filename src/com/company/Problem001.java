package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Problem001 {
    public static boolean findSumOf(int k, int[] listOfNumbers) {
        if (listOfNumbers == null || listOfNumbers.length < 2)
            return false;

        List<Integer> list = Arrays.stream(listOfNumbers).boxed().collect(Collectors.toList());
        Collections.sort(list);

        System.out.println(list);

        int i = list.size() - 1;
        int j = i - 1;

        while(i > 0 && list.get(i) > k) i--;

        while (i >= 0)
        {
            j = i - 1;
            while (j >= 0 && list.get(i) + list.get(j) > k) {
                System.out.println(i + ":" + j);
                j--;
            }
            if (j >=0 && list.get(i) + list.get(j) == k) {
                System.out.println(i + ":" + j);
                break;
            }
            i--;
        }

        System.out.println(i);
        System.out.println(j);

        return i >= 0 && j >= 0;
    }

    public static boolean findSumOf_Improved(int k, int[] listOfNumbers) {
        Set<Integer> set = Arrays.stream(listOfNumbers).boxed().collect(Collectors.toSet());
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (set.contains(k - listOfNumbers[i]))
                return true;
        }
        return false;
    }
}
