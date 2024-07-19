/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class J03009 {
    public static void solve(String s , String t) {
        String [] arrS = s.split("\\s+");
        Arrays.sort(arrS);
        Set<String> set = new LinkedHashSet<>();
        for (String x : arrS) set.add(x);
        for (String x : set) {
            if (!t.contains(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            solve(s , t);
        }
    }
}
