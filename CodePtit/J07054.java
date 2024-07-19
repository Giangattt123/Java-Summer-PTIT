/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07054 {
    static int num = 1;
    static final class SinhVien implements Comparable<SinhVien>{
        private String ma , name;
        private double dtb;
        private int rank;
        public SinhVien(){};
        public SinhVien(String name , double dtb) {
            this.ma = String.format("SV%02d", num++);
            this.name = chuanHoaTen(name);
            this.dtb = dtb;
        }
        public String chuanHoaTen(String s) {
            String[] arr = s.trim().toLowerCase().split("\\s+");
            String ans = "";
            for (String tmp : arr) {
                ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase() + " ";
            }
            ans = ans.trim();
            return ans;
        }

        @Override
        public int compareTo(SinhVien o) {
            if (this.dtb == o.dtb) {
                return this.ma.compareTo(o.ma);
            }
            return this.dtb > o.dtb ? -1 : 1;
        }
        
        @Override
        public String toString() {
            return this.ma + " " + this.name + " " + String.format("%.2f", this.dtb) + " " + this.rank;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("BANGDIEM.in");
        // File file = new File("src\\JavaSummer\\CodePtit\\BANGDIEM.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> lsv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int dm1 = Integer.parseInt(sc.nextLine());
            int dm2 = Integer.parseInt(sc.nextLine());
            int dm3 = Integer.parseInt(sc.nextLine());
            double dtb = (double) (dm1 * 3 + dm2 * 3 + dm3 * 2) / 8;
            lsv.add(new SinhVien(name, dtb));
        }
        Collections.sort(lsv);
        LinkedHashMap<Double, Integer> map = new LinkedHashMap<>();
        for (SinhVien i : lsv) {
            if (map.containsKey(i.dtb)) {
                int tanSuat = map.get(i.dtb);
                tanSuat++;
                map.put(i.dtb, tanSuat);
            } else {
                map.put(i.dtb, 1);
            }
        }
//        int rank = 1;
//        for (int i = 0; i < n;) {
//            int j = i;
//            while (j < n && lsv.get(j).dtb == lsv.get(i).dtb) {
//                lsv.get(j).rank = rank;
//                j++;
//            }
//            rank += (j - i);
//            i = j;
//        }
        int rank = 1, count = 0;
        for (int i = 0; i < n; i++) {
            int sl = map.get(lsv.get(i).dtb);
            for (int j = 0; j < sl; j++) {
                lsv.get(i + j).rank = rank;
            }
            rank += sl;
            i += sl - 1; 
        }
        for (SinhVien sv : lsv) {
            System.out.println(sv);
        }
    }
}
