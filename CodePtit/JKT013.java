/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Stack<String> ans = new Stack<>();
            Queue<String> q = new LinkedList<>();
            q.add("");
            while (!q.isEmpty()) {
                String s = q.poll();
                if (!s.equals("")) ans.add(s);
                if (s.length() == n) continue;
                q.add(s + "6");
                q.add(s + "8");
            }
            System.out.println(ans.size());
            while (!ans.isEmpty()) {
                System.out.print(ans.pop() + " ");
            }
            System.out.println("");
        }
    }
}
