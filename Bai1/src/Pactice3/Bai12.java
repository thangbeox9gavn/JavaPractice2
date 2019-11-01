// chuyển ma trận kề -> ds kề
package Pactice3;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.print(j+1+" ");
                }
            }
            System.out.println("");
        }

    }
}