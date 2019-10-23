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
public class Bai3 {

    static void print(int a[], int x) {
        System.out.print("Buoc " + x + ": ");
        for (int i = 0; i <= x; i++) {
            if (i <= x) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        print(a, 0);
        for (int i = 1; i < n - 1; i++) {
            int j = i - 1, t = a[i];
            while (j >= 0 && a[j] > t) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t;
            print(a, i);
        }
    }
}
