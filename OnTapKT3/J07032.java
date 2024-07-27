/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class J07032 {
    public static boolean checkThuanNghich(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if (!sb.toString().equals(s)) {
            return false;
        }

        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ois2.readObject();
        int cnt[] = new int[1000001];
        for (Integer x : l1) {
            if (checkThuanNghich(x.toString()) && l2.contains(x))
                cnt[x]++;
        }
        for (Integer x : l2) {
            if (checkThuanNghich(x.toString()) && cnt[x] != 0)
                cnt[x]++;
        }
        int count = 0;
        for (int i = 0 ; i <= 1000000 ; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
                count++;
            }
            if (count == 10) break;
        }
    }
}

