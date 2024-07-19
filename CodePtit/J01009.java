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
public class J01009 {
    public static Scanner sc = new Scanner(System.in);
    public static long factorial(int n) {
        long res = 1;
        for (int i = 1 ; i <= n ; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1 ; i <= n ; i++)
            sum += factorial(i);
        System.out.println(sum);
    }
}
