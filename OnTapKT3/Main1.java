/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\File\\number1.txt");
        Scanner sc = new Scanner(file);
        double x = 0f , t = 0f;
        DecimalFormat df = new DecimalFormat("##.##");
        
        // read 5 first value
//        for (int i = 0 ; i < 5 ; i++) {
//            x = sc.nextFloat();
//            System.out.println("Number: " + df.format(x));
//            t += x;
//        }

        // read all file
        int cnt = 0;
        while (sc.hasNextDouble()) {
            x = sc.nextDouble();
            System.out.println("Number: " + df.format(x));
            cnt++;
            t += x;
        }
        sc.close();
        System.out.println("File size: " + cnt);
        System.out.println("Sum of numbers: " + df.format(t));
        
        File file2 = new File("src\\File\\number2.txt");
        Scanner sc2 = new Scanner(file2);
        double x2 = 0f , t2 = 0f;
        while (sc2.hasNext()) {
            if (sc2.hasNextDouble()) {
                x2 = sc2.nextDouble();
                System.out.println("Number: " + df.format(x2));
                t2 += x2;
            } else {
                sc2.next();
            }
        }
        sc2.close();
        System.out.println("Sum of numbers: " + df.format(t2));
    }
}
