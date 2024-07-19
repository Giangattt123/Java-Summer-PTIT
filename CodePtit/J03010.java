/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String temp = "@ptit.edu.vn";
        for (int i = 0; i < n; i++) {
            String[] str = sc.nextLine().trim().toLowerCase().split("\\s+");
            String ans = str[str.length - 1];
            for (int j = 0; j < str.length - 1; j++) {
               ans += str[j].substring(0, 1);
            }
            String ansNew = ans;
            if (!map.containsKey(ans)) {
                map.put(ans, 1);
            } else {
                int count = map.get(ans);
                ++count;
                ansNew += count;
                map.put(ans, count);
            }
            ansNew += temp;
            arr.add(ansNew);
        }
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
