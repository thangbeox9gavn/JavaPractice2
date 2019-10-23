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
public class Bai6 {

    static int a[],n;

    static void sort(int left, int right) {
        if (left < right) {
            int mid = (right + left - 1) / 2;
            sort(left, mid);
            sort(mid + 1, right);

        }
    }

    static void merge(int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = a[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = a[mid + 1 + j];
        }

        // Initial indexes of first and second subaays 
        int i = 0, j = 0;

        // Initial index of merged subay aay 
        int k = 1;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }

    }

    static void print() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(0,n-1);
        print();
    }
}
