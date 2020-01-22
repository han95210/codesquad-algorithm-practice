package com.hamill.codesquad.algorithm.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(temp)) {
            int sum = 0;
            if(temp == 1) {
                return true;
            }
            seen.add(temp);

            while(temp > 0) {
                int digit = temp % 10;
                temp = temp / 10;
                sum = sum + digit * digit;
            }
            temp = sum;
        }
        return false;
    }
}