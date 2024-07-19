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
public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt() , cr = sc.nextInt();
        if (cd <= 0 || cd <= 0) {
            System.out.println("0");
        }else {
            System.out.println(2 * (cd + cr) + " " + cd * cr);
        }
    }
}
