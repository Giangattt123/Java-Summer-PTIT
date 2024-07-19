/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author Admin
 */
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("src\\JavaSummer\\CodePtit\\VANBAN.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
//            String line = sc.nextLine().toLowerCase();
//            System.out.println(line);
//            String [] arrLine = line.split("\\s+");
//            for (String tmp : arrLine)
//                set.add(tmp);
        }
//        for (String x : set) {
//            System.out.println(x);
//        }
    }
}
