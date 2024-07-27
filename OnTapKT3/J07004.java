/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\File\\DATA.in");
        Scanner sc = new Scanner(file);
        TreeMap<Integer , Integer> map = new TreeMap<>();
        while (sc.hasNext()) {
            String tmp = sc.next();
            int num = Integer.parseInt(tmp);
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
