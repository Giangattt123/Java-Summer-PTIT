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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][3];
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            int tong = 0;
            for (int j = 0 ; j < 3 ; j++) {
                a[i][j] = sc.nextInt();
                tong += a[i][j];
            }
            if (tong >= 2) count++;
        }
        System.out.println(count);
    }
}
