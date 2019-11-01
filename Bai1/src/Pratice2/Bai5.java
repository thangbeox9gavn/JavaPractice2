/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratice2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {
    static int n;
    static long a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-- >0){
            int n = in.nextInt();
            a = new long[n];
            
            for(int i=0;i<n;i++){
                a[i] = in.nextLong();                
            }
            Arrays.sort(a);
            print();
        }
        

        
    }
    
    static void print(){
        for(int i=0;i<a.length;i++){
            if(i<a.length-1)
                System.out.print(a[i] + " ");
            else
                System.out.print(a[i]);
        }
        System.out.println();
    }

}
