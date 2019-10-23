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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,t,n; long F[]=new long[100];
        F[0]=0; F[1]=1;
        for(i=2;i<=92;i++)F[i]=F[i-1]+F[i-2];
        t=in.nextInt();
        while(t-->0){
            n=in.nextInt();
            System.out.println(F[n]);
        }
    }
    
}
