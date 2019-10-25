/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-- > 0){
            int n = in.nextInt();
            int[] a = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            
            Arrays.sort(a);
            int min = a[1]-a[0];
            
            for(int i=0;i<n-1;i++){
                min = Math.min(min, a[i+1] - a[i]);
            }
            int count = 0;
            for(int i=0;i<n-1;i++){
                if(a[i+1] - a[i] == min)
                    count++;
            }
            System.out.println(min + " " + count);
        }
    }
}
