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
public class J02019 {
    public static boolean SumDiv(int n) {
        int sum = 1;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i){
                    sum += n / i;
                }
            }
        }
        return sum > n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a ; i <= b ; i++) {
            if (SumDiv(i)) count++;
        }
        System.out.println(count);
    }
}
