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
public class J03026 {
    public static int count(String a , String b) {
        int cnt;
        if (a.equals(b)) cnt = -1;
        else cnt = Math.max(a.length(), b.length());
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int res = count(a, b);
            System.out.println(res);
        }
    }
}
