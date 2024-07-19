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
public class J02007 {
    public static Scanner sc = new Scanner(System.in);

    public static void solve(int t) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] check = new int[100005];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            check[a[i]]++;
        }

        System.out.printf("Test %d:\n", t);
        for (int i = 0; i < n; i++) {
            if (check[a[i]] > 0) {
                System.out.printf("%d xuat hien %d lan\n", a[i], check[a[i]]);
                check[a[i]] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            solve(i);
        }
    }
}
