/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratice2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int left = 0;
            int right = n - 1;
            int pos = binSearch(a, k, left, right);
            if (pos != -1) {
                System.out.println(pos);
            } else {
                System.out.println("NO");
            }
        }
    }

    static int binSearch(long[] a, long k, int l, int r) {
        if (l < r) {
            int mid = (l + r - 1) / 2;
            if (a[mid] == k) {
                return mid + 1;
            } else {
                if (a[mid] < k) {
                    return binSearch(a, k, mid + 1, r);
                }
            }
            return binSearch(a, k, l, mid);
        }
        return -1;
    }
}
