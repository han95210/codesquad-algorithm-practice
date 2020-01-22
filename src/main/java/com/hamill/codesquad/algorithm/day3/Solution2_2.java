package com.hamill.codesquad.algorithm.day3;

import java.util.HashSet;
import java.util.Set;

public class Solution2_2 {
    public int singleNumber(int[] a) {
        Set<Integer> set = new HashSet<>();

        for(int n : a) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        Solution2My sol2 = new Solution2My();
        int[] numbers = {1,2,3,4,1,2,3,4,5,5,6,6,7};

        System.out.println(sol2.singleNumber(numbers));
    }
}
