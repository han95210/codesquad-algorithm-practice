package com.hamill.codesquad.algorithm.day3;

import java.util.Arrays;

public class SolutionMy {
    public boolean isHappy(int n) {
        SolutionMy sol = new SolutionMy();
        int result = sol.calc(n);

        int i = 0;
        while(result != 1) {
            result = sol.calc(result);
            i++;
            if(i > 1000) {
                break;
            }
        }
        boolean isTrue = false;
        if (result == 1) {
            isTrue = true;
        }
        return isTrue;
    }

    public int calc(int number) {
        String str = "";
        String numberStr = "" + number;
        if(number > 0 && number < 10) {
            numberStr = "0" + numberStr;
        }
        int sum = 0;
        int[] numbers;


        for (int i = 0; i < numberStr.length(); i++) {
            sum += Math.pow(Integer.parseInt(numberStr.substring(i,i+1)),2);
        }
        return sum;
    }

    public static void main(String[] args) {
        SolutionMy solm = new SolutionMy();

        System.out.println(solm.isHappy(19));
    }
}
