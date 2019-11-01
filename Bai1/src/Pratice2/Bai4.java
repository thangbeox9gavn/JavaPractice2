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
public class Bai4 {
    static int a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int flag = 0;
        for (int i = 0; i<n - 1; i++){
            if(check()){
                for (int j = 0; j < n-1 ; j++){
                    if (a[j] > a[j + 1]){
                        swap(j, j + 1);
                    }
                }
                print(i);
            }
        }
        
    }
    
    static void print(int x){
        System.out.print("Buoc " + (x +1) + ": ");
        for(int i=0;i<a.length;i++){
            if(i<a.length-1)
                System.out.print(a[i] + " ");
            else
                System.out.print(a[i]);            
        }
        System.out.println();
    }
    
    static void swap(int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    static boolean check(){
        for(int k=0; k<a.length-1;k++){
            if(a[k] > a[k+1])
                return true;
        }
        return false;
    }
}

