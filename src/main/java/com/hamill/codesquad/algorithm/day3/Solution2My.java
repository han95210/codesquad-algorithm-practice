package com.hamill.codesquad.algorithm.day3;

import java.util.Arrays;

public class Solution2My {

    // 두 개의 중복되는 배열 속 숫자들 사이에서 1개만 있는 숫자 출력하기
    public int singleNumber(int[] nums) {
        String[] numStrArr = new String[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            numStrArr[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < numStrArr.length; i++) {
            int a = Arrays.asList(numStrArr).indexOf(numStrArr[i]);
            int b = Arrays.asList(numStrArr).lastIndexOf(numStrArr[i]);
            if(a == b) {
                result = Integer.parseInt(numStrArr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2My sol2 = new Solution2My();
        int[] numbers = {1,2,3,4,1,2,3,4,5,5,6,6,7};

        System.out.println(sol2.singleNumber(numbers));
    }
}
