/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int []check = new int[1000];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            check[a[i]] = 1;
        }
        for (int i = 0 ; i < m ; i++) b[i] = sc.nextInt();
        Arrays.sort(b);
        for (int i = 0 ; i < m ; i++) {
            if (check[b[i]] == 1) {
                System.out.print(b[i] + " ");
                check[b[i]] = 0;
            }
        }
    }
}
