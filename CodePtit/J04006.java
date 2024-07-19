/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J04006 {
    static class SinhVien{
        private String msv , name , ns , Class;
        private String gpa;
        public SinhVien(){};
        public SinhVien(String name , String Class , String ns , float gpa) {
            this.name = name;
            this.ns = ns;
            this.msv = "B20DCCN001";
            this.Class = Class;
            this.gpa = String.format("%.2f", gpa);
        }
        @Override
        public String toString() {
            return this.msv + " " + this.name + " " + this.Class + " " + this.ns + " " + this.gpa;
        }
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Class = sc.nextLine();
        String ns = sc.nextLine();
        float gpa = sc.nextFloat();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(ns);
        String nsFormat = sdf.format(date);
        SinhVien sv = new SinhVien(name , Class , nsFormat , gpa);
        System.out.println(sv);
    }
}
