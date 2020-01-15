package com.hamill.codesquad.algorithm.day1;

public class problem2 {

    public static int reverse (int x) {

        long result = 0;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            x = x / 10;
            if (result >= 2147483647 || result <= -2147483648) {
                return 0;
            }
        }
        return (int)result;
    }


    public static void main(String[] args) {
        System.out.println((reverse(1234)));
        System.out.println((reverse(123241454)));

    }
}