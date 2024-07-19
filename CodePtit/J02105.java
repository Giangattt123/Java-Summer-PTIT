/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int [n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++)
                a[i][j] = sc.nextInt();
        }
        List<List<Integer>> lists = new ArrayList();
        for (int i = 0 ; i < n ; i++) {
            List<Integer> x = new ArrayList<>();
            for (int j = 0 ; j < n ; j++) {
                if (a[i][j] == 1) x.add(j + 1);
            }
            lists.add(x);
        }
        int index = 1;
        for (List<Integer> list : lists) {
            System.out.print("List(" + index + ") = ");
            for (int value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
            index++;
        }
    }
}
