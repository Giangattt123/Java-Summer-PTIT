/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Admin
 */
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i++)
            a[i] =sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int x : a) {
            if (!stack.isEmpty()) {
                if ((stack.peek() + x) % 2 == 0) {
                    stack.pop();
                } else {
                    stack.push(x);
                }
            } else {
                stack.push(x);
            }
        }
        int count = stack.size();
        System.out.println(count);
    }
}
