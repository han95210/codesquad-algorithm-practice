package com.hamill.codesquad.algorithm.day1;

public class problem2 {
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            if (result<= -2147483648 || result >=  2147483647) {
                return 0;
            }
            x = x / 10;
        }

        return (int)result;
    }
    public static void main(String[] args) {
        System.out.println((reverse(
                153423646)));
    }
}