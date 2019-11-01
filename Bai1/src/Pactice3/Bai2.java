
// Xâu con chung dài nhất
package Pactice3;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        String y;
        x = sc.nextLine();
        y = sc.nextLine();
        x = " " + x;
        y = " " + y;

        int a = x.length();
        int b = y.length();
        int c[][] = new int[1001][1001];
        for (int i = 0; i < a; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < b; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i < a; i++) {
            for (int j = 1; j < b; j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }
         System.out.println(c[a-1][b-1]);
    }

}
