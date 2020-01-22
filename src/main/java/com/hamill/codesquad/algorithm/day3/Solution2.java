package com.hamill.codesquad.algorithm.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    // 두 개의 중복되는 배열 속 숫자들 사이에서 1개만 있는 숫자 출력하기
    public int singleNumber(int[] nums) {
        int r = nums[0];
        for (int i=1; i<nums.length; i++)
            r ^= nums[i];
        return r;
    }

    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        int[] numbers = {2,3,1,4,5,8,1,2,4,3,9,5,8};
        System.out.println(sol2.singleNumber(numbers));

    }
}
