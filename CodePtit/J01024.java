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
public class J01024 {
    private static Scanner sc = new Scanner(System.in);
    private static boolean check(int n) {
        String s = String.valueOf(n);
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(check(n) ? "YES" : "NO");
        }
    }
}
