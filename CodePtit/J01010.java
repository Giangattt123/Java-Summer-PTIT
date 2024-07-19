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
public class J01010 {
    public static Scanner sc = new Scanner(System.in);
    public static String solve(String s) {
        String ans = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '8' && c != '9') {
                return "INVALID";
            } else {
                ans += (c == '1') ? "1" : "0";
            }
        }
        int j = 0;
        while (j < ans.length() && ans.charAt(j) == '0')
            ++j;
        String newAns = ans.substring(j);
        if (newAns.isEmpty() || ans.equals("0")) {
            return "INVALID";
        }
        return newAns;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String ans = solve(s);
            System.out.println(ans);
        }
    }
}
