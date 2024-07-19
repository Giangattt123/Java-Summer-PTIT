/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT1_CT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b2 {
    public static boolean check(String s) {
        int l = s.length();
        for (int i = 0 ; i < l / 2 ; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1))
                return false;
        }
        return true;
    }
    public static boolean check2(String s) {
        char [] ch = s.toCharArray();
        for (char c : ch) {
            if (c != '6' && c != '8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s) && check2(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
