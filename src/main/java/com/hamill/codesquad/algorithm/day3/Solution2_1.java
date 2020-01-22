package com.hamill.codesquad.algorithm.day3;

public class Solution2_1 {
    public int singleNumber(int[] a) {
        int result = 0;
        int K = 2;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int n : a) {
                if((n >> i & 1) == 1) {
                    sum++;
                }
            }
            sum %= K;
            result |= sum << i;
        }
        return result;
    }
}
