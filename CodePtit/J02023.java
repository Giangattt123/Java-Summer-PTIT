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
public class J02023 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] a = s.split("\\s+");
        int N = Integer.parseInt(a[0]);
        int S = Integer.parseInt(a[1]);
        if (S == 0) {
            if (N == 1) {
                System.out.println("0 0");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }

        if (S > 9 * N) {
            System.out.println("-1 -1");
            return;
        }

        StringBuilder maxNum = new StringBuilder();
        int sum = S;
        for (int i = 0; i < N; i++) {
            int digit = Math.min(9, sum);
            maxNum.append(digit);
            sum -= digit;
        }

        StringBuilder minNum = new StringBuilder(maxNum).reverse();
        int index = 0;
        while (minNum.charAt(index) == '0') {
            index++;
        }
        minNum.setCharAt(index, (char) (minNum.charAt(index) - 1));
        minNum.setCharAt(0, (char) (minNum.charAt(0) + 1));
        System.out.println(minNum.toString() + " " + maxNum.toString());
    }
}
