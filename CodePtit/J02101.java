/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02101 {
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int i = 0 , j = 0 , ok = 1;
        while (true) {
            System.out.print(a[i][j] + " ");
            if (ok == 1) {
                j++;
                if (j == n) {
                    i++;
                    j = n - 1;
                    ok = 0;
                }
            } else {
                j--;
                if (j < 0) {
                    i++;
                    j = 0;
                    ok = 1;
                }
            } 
            if (i == n) break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
