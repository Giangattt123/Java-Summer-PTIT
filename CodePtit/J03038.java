/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] a = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char x : a) {
            set.add(x);
        }
        System.out.println(set.size());
    }
}
