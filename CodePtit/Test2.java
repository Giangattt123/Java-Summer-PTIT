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
public class Test2 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 16 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                int k = (i & (1 << j));
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
