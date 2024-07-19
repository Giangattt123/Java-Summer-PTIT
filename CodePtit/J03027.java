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
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < arr.length ; i++) {
            char c = arr[i];
            if (!st.isEmpty()) {
                if (st.peek() == c) st.pop();
                else st.push(c);
            } else st.push(c);
        }
        StringBuilder sb = new StringBuilder("");
        if (st.isEmpty()) {
            System.out.println("Empty String");
        } else {
            while (!st.isEmpty()) {
                sb.append(st.peek());
                st.pop();
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
