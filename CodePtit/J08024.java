/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {
    public static boolean chiaHet(String s, int n) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            val = (val * 10 + (s.charAt(i) - '0'));
        }
        return val % n == 0;
    }
    public static ArrayList<String> arr = new ArrayList<>();
    public static Queue<String> q;
    public static void solve() {
        q = new LinkedList<>();
        q.add("9");
        while (q.size() < 1000) {
            String s = q.peek();
            arr.add(s);
            q.poll();
            q.add(s + "0");
            q.add(s + "9");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        solve();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (String  x : arr) {
                if (chiaHet(x, n)) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
