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
public class J01018 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(char a, char b) {
        if (Math.abs((a - '0') - (b - '0')) == 2) {
            return true;
        } else {
            return false;
        }
    }
        
    public static void solve() {
        String s = sc.next();
        for (int i = 1; i < s.length(); i++) {
            if (!check(s.charAt(i), s.charAt(i - 1))) {
                System.out.println("NO");
                return;
            }
        }
        int sumDigit = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            sumDigit += (s.charAt(i) - '0');
        }
        if (sumDigit % 10 == 0) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}

