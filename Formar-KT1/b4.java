/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b4 {
    static class Sinhvien{
        public String ma , name;
        public String gt;
        public String status;
        public Sinhvien(){};
        public void input() {
            Scanner sc = new Scanner(System.in);
            String ma = sc.nextLine().toUpperCase();
            String name = sc.nextLine();
            String gt = sc.nextLine().toLowerCase();
            float diem = sc.nextFloat();
            this.ma = ma;
            this.name = name;
            this.gt = "true".equals(gt) ? "nam" : "nu";
            this.status = diem >= 5 ? "dat" : "hoc lai";
        }
        public void out() {
            System.out.println(this.ma + " " + this.name + " " + this.gt + " " + this.status);
        }
    }
   public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
