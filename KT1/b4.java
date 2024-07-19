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
public class b4 {
    static int num = 1;
    static class SanPham{
        private String ten , nhaSX , ma;
        private int soLuong;
        private double gia, tT;
        public SanPham(){};
        public SanPham(String ten , int soLuong , double gia ,String nhaSX){
            this.ma = nhaSX.toUpperCase() + "-" + String.format("%03d", num++);
            this.ten = ten;
            this.soLuong = soLuong;
            this.gia = gia;
            this.tT = (soLuong < 20) ? soLuong * gia : soLuong * gia * 0.9;
        }

      

        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + this.soLuong + " " + String.format("%.1f", gia) + " " + String.format("%.1f", this.tT);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String ten;
        String nhaSX;
        int soLuong;
        double gia;
        while(n-->0){
            ten=sc.nextLine();
            nhaSX=sc.nextLine();
            soLuong=Integer.parseInt(sc.nextLine());
            gia=Double.parseDouble(sc.nextLine());
            SanPham p = new SanPham(ten, soLuong, gia, nhaSX);
            System.out.println(p);
        }
    }
}
