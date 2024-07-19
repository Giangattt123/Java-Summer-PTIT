/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b1 {
    public static void solve(String s) {
        String sNew = s.trim().toLowerCase();
        String [] arr = sNew.split("\\s+");
        String ans = arr[0].substring(0 , 1).toUpperCase() + arr[0].substring(1) + " ";
        for (int i = 1 ; i < arr.length - 1; i++) {
            ans += arr[i] + " ";
        }
        ans += arr[arr.length - 1].substring(0 , 1).toUpperCase() + arr[arr.length - 1].substring(1) + " ";
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
