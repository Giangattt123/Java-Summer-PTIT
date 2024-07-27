/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src\\File\\test.txt");
        Scanner sc = new Scanner(f);
        int cntLine = 0;
        while (sc.hasNextLine()) {
            ++cntLine;
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        System.out.println("Count line in file: " + cntLine);
    }
}
