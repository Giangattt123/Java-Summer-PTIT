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
public class J01021 {
    private static Scanner sc = new Scanner(System.in);
    private static final int MOD = (int) 1e9 + 7;
    // use recursion
    private static long calc(Long a , Long b) {
        if (b == 0) return 1;
        long res = calc(a , b / 2);
        res = (res * res) % MOD;
        if (b % 2 == 1) res = (res * a) % MOD;
        return res;
    }
    // not use recursion
    public static long calc1(Long a , Long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res *= a;
                res %= MOD;
            }
            a *= a;
            a %= MOD;
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        while (true) {
            long a = sc.nextLong() , b = sc.nextLong();
            if (a == 0 && b == 0) return;
            System.out.println(calc(a, b));
        }
    }
}
