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
public class J02014 {
    private static Scanner sc = new Scanner(System.in);
    public static void solve() {
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] f = new int[n];
        for (int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        f[0] = a[0];
        for (int i = 1 ; i < n ; i++)
            f[i] = f[i - 1] + a[i];
        int sumValue = f[n - 1];
        for (int i = 1 ; i < n ; i++) {
            if (f[i - 1] == sumValue - f[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
