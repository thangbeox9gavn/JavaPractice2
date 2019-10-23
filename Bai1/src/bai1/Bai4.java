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
public class Bai4 {
    static void in(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean check = false;
            for(int j = 1; j < n-i-1;j++){
                if(a[j-1] > a[j]){
                    check = true;
                    int t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                }
            }
            if(!check) break;
            System.out.print("Buoc "+(i+1)+":");
            in(a,n);
            System.out.println("");
        }
    }
}
