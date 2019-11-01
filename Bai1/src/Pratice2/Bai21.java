/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratice2;

import java.util.*;

/**
 *
 * @author MT
 */
public class Bai21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long n;
        long[] a;
        while (t-- > 0) {
            n = in.nextLong();
            a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            Stack s = new Stack();
            s.push(a[0]);
            for (int i = 1; i < n; i++) {
                if (s.isEmpty()) {
                    s.push(a[i]);
                } else {
                    while (!s.isEmpty()) {
                        long y = (long) s.pop();
                        if(a[i] > y) {
                            System.out.print(a[i]+" ");
                        }
                        else {
                            s.push(y);
                            s.push(a[i]);
                            break;
                        }
                    }
                    if(s.isEmpty()) s.push(a[i]);
                }
            }
            while(!s.isEmpty()) {
                s.pop();
                System.out.print("-1 ");
            }
        }
    }
}
