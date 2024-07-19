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
public class J01004 {
    public static boolean checkNT(long n) {
        if (n < 2) return false;
        for (long i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; i++) {
           int n = sc.nextInt();
//           if (checkNT(n)) {
//               System.out.println("YES");
//           } else {
//               System.out.println("NO");
//           }
           // ternary operator
           System.out.println(checkNT(n) ? "YES" : "NO");
        }
    }
}
