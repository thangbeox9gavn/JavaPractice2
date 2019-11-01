// BFS
package Pactice3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai17 {

    static boolean[] xet;
    static int[][] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int boSoTest = in.nextInt();
        while(boSoTest-->0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int u = in.nextInt();
            xet = new boolean[n+1];
            a = new int[n+1][n+1];
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(u);
            for(int i=1;i<=x;i++) {
                int t = in.nextInt();
                int k = in.nextInt();
                a[t][k] = 1;
                a[k][t] = 1;
            }
            while(!queue.isEmpty()) {
                int s = queue.poll();
                xet[s] = true;
                for(int i = 1;i<=n;i++) {
                    if(a[s][i] == 1 && !xet[i]) {
                        queue.add(i);
                        xet[i] = true;
                    }
                }
                System.out.print(s+ " ");
            }
            System.out.println();
        }
    }
}
