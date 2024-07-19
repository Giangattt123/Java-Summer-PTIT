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
public class J03021 {
    public static char Number(char  c) {
        if (c == 'a' || c == 'b' || c == 'c') return '2';
        if (c == 'd' || c == 'e' || c == 'f') return '3';
        if (c ==  'g' || c == 'h' || c == 'i') return '4';
        if (c == 'j' || c == 'k' || c == 'l') return '5';
        if (c == 'm' || c == 'n' || c == 'o') return '6';
        if (c == 'p' || c == 'q' || c == 'r' ||  c == 's') return '7';
        if (c == 't' || c == 'u' || c == 'v') return '8';
        if (c == 'w' || c == 'x' || c == 'y' || c == 'z') return '9';
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next().toLowerCase();
            String ans =  "";
            for (int i  = 0 ; i < s.length() ; i++) {
                ans += Number(s.charAt(i));
            }
            StringBuilder sb = new StringBuilder(ans);
            if (ans.equals(sb.reverse().toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
