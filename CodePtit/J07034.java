/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class J07034 {
    static class MonHoc implements Comparable<MonHoc> {
        private String ma , ten , stc;
        public MonHoc(String ma , String ten , String stc) {
            this.ma = ma;
            this.ten = ten;
            this.stc = stc;
        }
        @Override
        public int compareTo(MonHoc o) {
            return this.ten.compareTo(o.ten);
        }
        
        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + this.stc;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        List<MonHoc> mhs = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String stc = sc.nextLine();
            MonHoc mh = new MonHoc(ma, ten, stc);
            mhs.add(mh);
        }
        Collections.sort(mhs);
        for (MonHoc mh : mhs) {
            System.out.println(mh);
        }
    }
}
