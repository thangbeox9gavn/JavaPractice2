// chuyển ds kề -> ma trận kề
package Pactice3;

import java.util.Scanner;

public class Bai13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soDinh = in.nextInt();
        in.nextLine();
        int[][] a = new int[soDinh+1][soDinh+1];
        for(int i =1;i<=soDinh;i++) {
            String line = in.nextLine();
            String[] elements = line.split(" ");
            for(int j =0;j<elements.length;j++) {
                int x = Integer.parseInt(elements[j]);
                a[i][x] = 1;
            }
        }
        for(int i=1;i<=soDinh;i++) {
            for(int j = 1;j<=soDinh;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
