// Đường đi DFS
package Pactice3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hailo
 */
public class Bai22 {
    static boolean[] xet;
    static LinkedList<Integer>[] list;
    static int[] truoc;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int u = in.nextInt();
            int v = in.nextInt();
            list = new LinkedList[n+1];
            xet = new boolean[n+1];
            truoc = new int[n+1];
            for(int i=1;i<=n;i++) {
                list[i] = new LinkedList<Integer>();
            }
            for(int i =1;i<=m;i++) {
                int a = in.nextInt();
                int b= in.nextInt();
                list[a].add(b);
                list[b].add(a);
            }
            dfs(u,v);
        }
    }
     static void dfs(int u,int v) {
        int count = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(u);
        xet[u] = true;
        while(!stack.isEmpty()) {
            int k = stack.pop();
            for(Integer i: list[k]) {
                if(!xet[i]) {
                    stack.push(k);
                    stack.push(i);
                    xet[i] = true;
                    truoc[i] = k;
                    break;
                }
            }
        }
        boolean check = true;
        int t = truoc[v];
        while(check) {
            count++;
            if(t==u) {
                check = false;
            } else if(t==0){
                check = false;
                count = -1;
            }
            t = truoc[t];
            
        }
        System.out.println(count);
    }
    
}
