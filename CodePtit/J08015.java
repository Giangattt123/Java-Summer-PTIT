/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong() , k = sc.nextLong();
            Long [] a = new Long [(int)n];
            for (int i = 0 ; i < n ; i++) {
                a[i] = sc.nextLong();
            }
            long cnt = 0;
            
            // TLE > 2.00s
//            for (int i = 0 ; i < n - 1 ; i++) {
//                for (int j = i + 1 ; j < n ; j++) {
//                    if (a[i] + a[j] == k) cnt++;
//                }
//            }
            Map<Long , Long> map = new HashMap<>();
            for (int i = 0 ; i < n ; i++) {
                long remain = k - a[i];
                if (map.containsKey(remain)) {
                    cnt += map.get(remain);
                }
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1L);
                }
            }
            System.out.println(cnt);
        }
    }
}
