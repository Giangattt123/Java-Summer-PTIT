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
public class J03007 {
    public static Scanner sc = new Scanner(System.in);
    public static int sum(String s) {
        int Sum = 0;
        int len = s.length();
        for (int i = 0 ; i < len ; i++) {
            Sum += (s.charAt(i) - '0');
        }
        return  Sum;
    }
    public static boolean check(String s) {
        int len = s.length();
        if (sum(s) % 10 != 0) return false;
        for (int i = 0; i <= len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t;
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s;
            s = sc.next();
            if (!s.isEmpty()) {
                if (check(s)) {
                    if (s.matches("^8.*8$"))
                        System.out.println("YES");
                    else System.out.println("NO");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}  
