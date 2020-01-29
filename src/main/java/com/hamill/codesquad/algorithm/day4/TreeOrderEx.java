package com.hamill.codesquad.algorithm.day4;

import java.util.Scanner;

public class TreeOrderEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();

        int[][] a = new int[26][2];
        for(int i = 0; i < n; i++) {
            String str = scanner.nextLine();

            int x = str.charAt(0) - 'A';
            char y = str.charAt(2);
            char z = str.charAt(4);

            if(y == '.') {
                a[x][0] = -1;
            }else{
                a[x][0] = y - 'A';
            }
            if(z == '.') {
                a[x][1] = -1;
            }else{
                a[x][1] = z - 'A';
            }
        }
        preorder(a, 0);
        System.out.println();
        inorder(a,0);
        System.out.println();
        postorder(a,0);
        System.out.println();
    }

    public static void preorder(int[][] a, int x) {
        if(x == -1) { return; }
        System.out.print((char)(x+'A'));
        preorder(a,a[x][0]);
        preorder(a,a[x][1]);
    }

    public static void inorder(int[][] a, int x) {
        if(x == -1) { return; }
        inorder(a,a[x][0]);
        System.out.print((char)(x+'A'));
        inorder(a,a[x][1]);
    }

    public static void postorder(int[][] a, int x) {
        if(x == -1) { return; }
        postorder(a,a[x][0]);
        postorder(a,a[x][1]);
        System.out.print((char)(x+'A'));
    }
}
