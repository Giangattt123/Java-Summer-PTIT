/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            s = sc.next();
            try {
                Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                a.add(s);
            }
        }
        Collections.sort(a);
        for (String i : a)
            System.out.print(i + " ");
    }
}
