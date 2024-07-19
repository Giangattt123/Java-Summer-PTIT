/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J05081 {
    static int num = 1;
    static class MatHang implements Comparable<MatHang>{
        private String ma , ten , dv;
        private int giaMua , giaBan , loiNhuan;
        public MatHang(){};
        public MatHang(String ten , String dv , int giaMua , int giaBan) {
            this.ma = "MH" + String.format("%03d", num++);
            this.ten = ten;
            this.dv = dv;
            this.giaMua = giaMua;
            this.giaBan = giaBan;
            this.loiNhuan = giaBan - giaMua;
        }    
        
        @Override
        public int compareTo(MatHang o) {
            if (this.loiNhuan != o.loiNhuan) {
                if (this.loiNhuan > o.loiNhuan) return -1;
                else if (this.loiNhuan < o.loiNhuan) return 1;
                else return 0;
            }
            return this.ma.compareTo(o.ma);
        }
        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + this.dv + " " + this.giaMua + " "
                    + this.giaBan + " " + this.loiNhuan;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<MatHang> mhs = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            sc.nextLine();
            MatHang mh = new MatHang(ten , dv , giaMua , giaBan);
            mhs.add(mh);
        }
        Collections.sort(mhs);
        for (MatHang m : mhs) {
            System.out.println(m);
        }
    }
}
