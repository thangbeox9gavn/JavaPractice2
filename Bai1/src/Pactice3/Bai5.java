// C(n,k)
package Pactice3;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai5 {
     public static long MOD = (long)1e9+7;
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t;

        int n,k;
        t = sc.nextInt();

        long C[][] = new long[1001][1001];

        for(int j = 0; j < 1001; j++){
            C[0][j] = 1l;
        }

        for(int j = 1; j  < 1001; j++ ){

            for(int i = 1; i <= j; i++){
                C[i][j] = (C[i][j-1] + C[i-1][j-1])%MOD;
            }
        }
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            System.out.println(C[k][n]);
        }
    }
}
