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
public class J02028 {
    public static long [] a = new long [100005];
    public static Scanner sc = new Scanner(System.in);
    public static boolean binarySearch(int l , int r , long x) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) return true;
            else if (a[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
    public static void solve() {
        int n = sc.nextInt();
        long K = sc.nextLong();
        for (int i = 1 ; i <= n ; i++) {
            a[i] = sc.nextInt();
            a[i] += a[i - 1];
        }
        if (a[n] == K) {
            System.out.println("YES");
            return;
        }
        for (int i = 1 ; i <= n ; i++) {
            if (binarySearch(i , n , a[i - 1] + K)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
