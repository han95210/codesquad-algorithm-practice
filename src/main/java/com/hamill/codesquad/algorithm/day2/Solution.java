package com.hamill.codesquad.algorithm.day2;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] resultArr = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int startNum = commands[i][0];
            int endNum = commands[i][1];
            int searchNum = commands[i][2];

            int[] sliceArr = Arrays.copyOfRange(array, startNum-1, endNum);
            Arrays.sort(sliceArr);
            int resultNum = sliceArr[searchNum-1];
            resultArr[i] = resultNum;
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(array, commands)));
    }
}
