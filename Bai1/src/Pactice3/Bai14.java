// Tìm đường đi trong đồ thị vô hướng
package Pactice3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai14 {
    
    static boolean[] xet;
    static LinkedList<Integer>[] list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            list = new LinkedList[n+1];
            for(int i =1;i<=n;i++) {
                list[i] = new LinkedList<Integer>();
            }
            for(int i = 1;i<=m;i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            int q = in.nextInt();
            while(q-->0) {
                xet = new boolean[n+1];
                Queue<Integer> queue = new LinkedList<Integer>();
                int x = in.nextInt();
                int y = in.nextInt();
                queue.add(x);
                boolean isTarget = false;
                while(!queue.isEmpty()) {
                    int k = queue.poll();
                    xet[k] = true;
                    for(Integer i: list[k]) {
                        if(!xet[i]) {
                            queue.add(i);
                            if(i == y && !isTarget) {
                                System.out.println("YES");
                                isTarget = true;
                                break;
                            }
                        }
                    }
                }
                if(queue.isEmpty() && !isTarget) {
                    System.out.println("NO");
                }
            }
        }
    }

}
