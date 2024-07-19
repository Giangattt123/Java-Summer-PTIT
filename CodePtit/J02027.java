/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DucGiang
 */

public class J02027 {
    public static Scanner sc = new Scanner(System.in);
    public static int findIndex(int []a , int l , int r , int target) {
        int len = a.length;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] < target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        int [] a;
        while (t-- > 0) {
           int n = sc.nextInt();
           int k = sc.nextInt();
           a = new int [n];
           for (int i = 0 ; i < n ; i++) {
               a[i] = sc.nextInt();
           }
            Arrays.sort(a);
//            for (int x : a) {
//                System.out.print(x + " ");
//            }
            long count = 0;
            for (int i = 0 ; i < n - 1 ; i++) {
                int index = findIndex(a, i + 1, n - 1, a[i] + k);
                if (index != -1) {
                    count += (index - i);
                }
            }
            System.out.println(count);
        }
    }
}
