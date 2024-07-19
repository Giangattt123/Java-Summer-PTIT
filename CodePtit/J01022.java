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
public class J01022 {
    public static Scanner sc = new Scanner(System.in);
    public static long[] F = new long[93];
    
    public static void Fibo() {
        F[0] = 0L;
        F[1] = 1L;
        for (int i = 2 ; i <= 92 ; i++)
            F[i] = F[i - 1] + F[i - 2];
    }
    public static char xauNhiPhan(int n , long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= F[n - 2])return xauNhiPhan(n - 2 , k);
        else return xauNhiPhan(n - 1 , (k - F[n - 2]));
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        Fibo();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(xauNhiPhan(n, k));
        }
    }
}
