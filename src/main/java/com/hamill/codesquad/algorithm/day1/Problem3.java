package com.hamill.codesquad.algorithm.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        Integer[] array2 = new Integer[] {10, 45, 1, 3, 100, -10, 200, 5};
        System.out.println("기존배열 : " + Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("sort : " + Arrays.toString(array2));

        List<Integer> list = Arrays.asList(array2);
        Collections.reverse(list);
        array2 = list.toArray(new Integer[list.size()]);

        System.out.println("list 로 변환 후 reverse : " + Arrays.toString(array2));
    }

    public void example() {
        List list = new ArrayList();
        list.add("hello");
        String str = (String)list.get(0);

        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        String str2 = list2.get(0);

    }

    public class Corn {

        private Object obj;
        public Object get() {
            return obj;
        }
        public void set(Object obj) {
            this.obj = obj;
        }
    }


}
