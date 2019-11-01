// BFS ????
package Pactice3;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai19 {
    static boolean[] xet;
    static LinkedList<Integer>[] list;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            list = new LinkedList[n + 1];
            for (int i = 1; i <= n; i++) {
                list[i] = new LinkedList<Integer>();
            }
            xet = new boolean[n + 1];
            int count = 0;
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if (!xet[i]) {
                    count++;
                    BFS(i);
                    System.out.println();
                }
            }
        }

    }

    static void BFS(int u) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(u);
        while (!queue.isEmpty()) {
            int k = queue.poll();
            xet[k] = true;
            for (Integer i : list[k]) {
                if (!xet[i]) {
                    queue.add(i);
                    xet[i] = true;
                }
            }
            System.out.print(k + " ");
        }

    }
}
