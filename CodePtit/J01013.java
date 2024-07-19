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
public class J01013 {
    public static final int maxN = (int) 2e6;
    public static int[] prime = new int[maxN + 1];

    public static void minDiv() {
        for (int i = 2; i * i <= maxN; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= maxN; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= maxN; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }

    public static int cal(int n) {
        if (prime[n] == 0) {
            return n;
        }
        int sum = 0;
        while (n != 1) {
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        minDiv();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            sum += cal(val);
        }
        System.out.println(sum);
    }
}

