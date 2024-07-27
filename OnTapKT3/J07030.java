/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class J07030 {
    public static final int Max = (int) 1e6;
    public static final int Sum = 1000000;
    public static int prime[] = new int[Max + 1];

    public static void sangNguyenTo() {
        for (int i = 0 ; i <= Max ; i++) prime[i] = 1;
        prime[0] = prime[1] = 0;
        for (int i = 2 ; i <= Math.sqrt(Max) ; i++) {
            if (prime[i] == 1) {
                for (int j = i * i ; j <= Max ; j += i) {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        String file1 = "src\\File\\DATA1.in";
        String file2 = "src\\File\\DATA2.in";
        List<Integer> list1 = new ArrayList<>();
        list1.add(22643);
        list1.add(227);
        list1.add(25583);
        List<Integer> list2 = new ArrayList<>();
        list2.add(974417);
        list2.add(977357);
        list2.add(999773);
        IOFile.write(file1, list1);
        IOFile.write(file2, list2);
        List<Integer> l1 = IOFile.read(file1);
        List<Integer> l2 = IOFile.read(file2);
        sangNguyenTo();
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        for (int value : l1) 
            if (prime[value] == 1)
                set1.add(value);
        for (int value : l2)
            if (prime[value] == 1)
                set2.add(value);
        for (int value : set1) {
            if (value * 2 >= Sum) break;
            if (set2.contains(Sum - value)) {
                System.out.println(value + " " + (Sum - value));
            }
        }
    }
}
