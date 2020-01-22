package com.hamill.codesquad.algorithm.day2;

public class Solution2 {

//    public void solution2(int[] array) {
//
//
//    }

    void sort (int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int x = array[(pl+pr)/2];

        do{
            while(array[pl] < x) pl++;
            while(array[pr] > x) pr--;
            if(pl <= pr) {
                int temp = array[pl];
                array[pl] = array[pr];
                array[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(array, left, pr);
        if(right > pl) sort(array, pl, right);
    }

    public static void main(String[] args) {
        int[] array = {5,2,3,1,4,2,3,5,1,7};
        Solution2 sol2 = new Solution2();
        sol2.sort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
