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
public class J01017 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(char a, char b) {
        if (Math.abs((a - '0') - (b - '0')) == 1) {
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
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}