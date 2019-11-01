/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pactice3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hailo
 */
public class Bai20 {
     static boolean[] xet;
    static LinkedList<Integer>[] list;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            list = new LinkedList[n+1];
            for(int i =1;i<=n;i++) {
                list[i] = new LinkedList<Integer>();
            }
            xet = new boolean[n+1];
            int count = 0;
            for(int i = 1;i<=m;i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            for(int i =1;i<=n;i++) {
                if(!xet[i]) {
                    count++;
                    DFS(i);
                    System.out.println();
                }
            }
        }

    }
    static void DFS(int u) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(u);
        xet[u] = true;
        System.out.print(u+ " ");
        while(!stack.isEmpty()) {
            int k = stack.pop();
            for(Integer i: list[k]) {
                if(!xet[i]) {
                    stack.push(k);
                    stack.push(i);
                    xet[i] = true;
                    System.out.print(i+ " ");
                    break;
                }
            }
            
        }
    }
}
