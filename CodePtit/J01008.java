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
public class J01008 {
    public static Scanner sc = new Scanner(System.in);
    public static void inSieve(long n) {
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            int cnt = 0;
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    cnt++;
                }
                System.out.print(i + "(" + cnt + ")" + " ");
            }
        }
        if (n != 1) System.out.println(n + "(" + 1 + ")");
        else System.out.println();
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++) {
            long n = sc.nextLong();
            System.out.print("Test " + i + ": ");
            inSieve(n);
        }
    }
}
