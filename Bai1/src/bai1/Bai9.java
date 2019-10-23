/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai9 {

    static int binarySearch(int a[], int n, int x) {
        int d = 0;
        int c = n-1;
        while (d < c) {
            int m = (c - d) / 2;
            if (x == a[m]) {
                return x;
            }
            if (x < a[m]) {
                c = m - 1;
            } else {
                d = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int result = binarySearch(a, n, k);

            if (result == -1) {
                System.out.println("NO");
            } else {
                System.out.println(result);
            }
        }
    }
}
