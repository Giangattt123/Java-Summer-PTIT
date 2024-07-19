/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

class sinhvien {
    String msv, ten, malop, ngaysinh;
    double gpa;

    public sinhvien(int stt, String ten, String malop, String ngaysinh, double gpa) throws ParseException {
        this.msv = "B20DCCN" + String.format("%03d", stt);
        this.ten = ten;
        this.malop = malop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + malop + " " + ngaysinh + " " + String.format("%.2f", gpa);
    }
}
public class J05003 {
     public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<sinhvien> sv = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sv.add(new sinhvien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        sv.forEach(System.out::println);
        sc.close();
    }
}
