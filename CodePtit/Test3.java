/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.TreeSet;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test3 {
    public static String getName(String s) {
        String[] arr = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (String tmp : arr) {
            ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) {
        String s = "  vO   hOAnG Yen   nhI  ";
        System.out.println(getName(s));
    }
}
