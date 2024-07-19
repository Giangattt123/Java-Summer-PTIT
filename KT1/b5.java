/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT1_CT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b5 {
    static int num = 1;
    static class Tour{
        private String ma;
        private int soNguoi;
        private double gia , tT;
        public Tour(String tu , String den , int soNguoi , double gia) {
            this.ma = tu + "-" + den + "*" + String.format("%03d", num++);
            this.soNguoi = soNguoi;
            this.gia = gia;
            this.tT = tinhTien(soNguoi, gia);
        }
        public double tinhTien(int soNguoi , double gia){
            double ans = 0f;
            if (soNguoi < 5) 
                ans = soNguoi * gia;
            else if (soNguoi >= 5 && soNguoi <= 10)
                ans = soNguoi * gia * 0.9;
            else ans = soNguoi * gia * 0.8;
            return ans;
        }
        @Override
        public String toString() {
            return this.ma + " " + this.soNguoi + " " + String.format("%.1f", gia) + " " + String.format("%.1f", this.tT);
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String tu = sc.nextLine();
            String den = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            double gia = Double.parseDouble(sc.nextLine());
            Tour tour = new Tour(tu, den, soLuong, gia);
            System.out.println(tour);
        }
    }
}
