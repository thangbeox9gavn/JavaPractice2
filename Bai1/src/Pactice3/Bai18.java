// DFS
package Pactice3;

import java.util.Scanner;

public class Bai18 {
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
            for(int i=1;i<=x;i++) {
                int t = in.nextInt();
                int k = in.nextInt();
                a[t][k] = 1;
                a[k][t] = 1;
            }
            System.out.print(u+ " ");
            dfs(u,n);
            System.out.println();
        }
    }
    
    static void dfs(int u, int n) {
        xet[u] = true;
        for (int v=1; v<=n; v++) {
            if ( a[u][v] == 1 && !xet[v]) {
                System.out.print(v+ " ");
                dfs(v,n);
            }
        }
        
    }
}
