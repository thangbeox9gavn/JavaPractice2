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
public class Bai12 {

    static long M = (long) (1e9 + 7);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, t, k;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(powM(n, k));
        }
    }

    static long powM(int n, int k) {
        if (k == 0) {
            return 1;
        }
        long x = powM(n, k / 2);
        if (k % 2 != 0) {
            return (x * x % M) * n % M;
        } else {
            return (x * x)%M;
        }

    }
}
