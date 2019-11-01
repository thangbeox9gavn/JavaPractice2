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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    static void in(int a[],int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[100];
        for(int i = 0; i< n;i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j< n;j++){
                if(a[i] > a[j]){
                    int x = a[j];
                    a[j] = a[i];
                    a[i] = x;
                }
            }
            System.out.print("Buoc"+(i+1)+":");
            in(a,n);
            System.out.println("");
        }
    }
    
}
