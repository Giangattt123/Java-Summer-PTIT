/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c3 = 0;
        int c5 = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '3') ++c3;
            if (s.charAt(i) == '5') ++c5;
        }
        if ((c3 + c5) == 3 || (c3 + c5) == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
