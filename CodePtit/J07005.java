/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] count = new int[1005];
        while (dis.available() > 0) {
            int number = dis.readInt();
            if (number < 100000) {
                count[number]++;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
