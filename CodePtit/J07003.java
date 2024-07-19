/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\JavaSummer\\CodePtit\\DATA.in");
        Scanner sc = new Scanner(file);
        String s = sc.next();
//        System.out.println(s);
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }
        while (s.length() > 1){
            BigInteger a = new BigInteger(s.substring(0 , s.length() / 2));
            BigInteger b = new BigInteger(s.substring(s.length() / 2));
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}
