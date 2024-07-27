/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07072 {
    public static String chuanHoaTen(String s) {
        String[] arr = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (String tmp : arr) {
            ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase() + " ";
        }
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\File\\DANHSACH.in");
        Scanner sc = new Scanner(file);
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ans = chuanHoaTen(sc.nextLine());
            list.add(ans);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String [] s1 = o1.split("\\s+");
                String [] s2 = o2.split("\\s+");
                int len1 = s1.length , len2 = s2.length;
                if (s1[len1 - 1].compareTo(s2[len2 - 1]) != 0)
                    return s1[len1 - 1].compareTo(s2[len2 - 1]);
                return o1.compareTo(o2);
            }
        });
        for (String tmp : list)
            System.out.println(tmp);
    }
}
