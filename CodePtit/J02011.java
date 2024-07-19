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
public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        for (int i = 0 ; i < n - 1 ; i++) {
            int min_pos = i;
            for (int j = i + 1 ; j < n ; j++) {
                if (a[min_pos] > a[j]) {
                    min_pos = j;
                }
            }
            int temp = a[min_pos];
            a[min_pos] = a[i];
            a[i] = temp;
            System.out.printf("Buoc %d: ", i + 1);
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
