/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    static int a[],n;
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        print(0);

        for(int i=1;i<n;i++){
            int key = a[i];
            int j = i-1;
            
            while(j>=0 && a[j] > key){
                a[j+1]= a[j];
                j--;                        
            }
            a[j+1] = key;
            print(i);
        }
    }
    
    static void print(int x){
        System.out.print("Buoc " + x + ": ");
        for(int i=0;i<=x;i++){
            if(i<=x)
                System.out.print(a[i] + " ");
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }
}
