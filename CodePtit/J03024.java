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
public class J03024 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.matches("^[1-9]\\d*")) {
                int len = s.length(), chan = 0,le = 0;
                for (int i = 0; i < len; i++) {
                    if ((s.charAt(i) - '0') % 2 == 0) {
                        chan++;
                    } else {
                        le++;
                    }
                }
                if ((len % 2 == 0 && chan > le) || (len % 2 != 0 && le > chan)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
