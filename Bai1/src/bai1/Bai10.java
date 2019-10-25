/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Bai10 {

    static int n, k;
    static double cost[] = new double[100001];
    public static void main(String[] args) {
//        general.AutoInput.setup();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            cost[i] = sc.nextInt();
        }
        Arrays.sort(cost, 1, n + 1);
        k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            double money = sc.nextInt() + 0.5;
            int result = Arrays.binarySearch(cost, 1, n + 1, money);
            result = -result - 2;
            System.out.println(result);
        }
    }
}

