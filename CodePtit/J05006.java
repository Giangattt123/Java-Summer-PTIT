/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

class NhanVien {
    public static int num = 1;
    private String ten , gioitinh, ngaysinh, diachia, mst , time ,id;

    public NhanVien() {
    }

    public NhanVien(String ten, String gioitinh, String ngaysinh, String diachia, String mst, String time) {
        this.id = "000" + String.format("%02d", num++);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachia = diachia;
        this.mst = mst;
        this.time = time;
    }
   
   
    @Override
    public String toString(){
        return this.id + " " + this.ten + " " + this.gioitinh + " " + this.ngaysinh + " " + this.diachia + " " + mst + " " + this.time;
    }
    
}
public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while( t -- > 0){
            String ten = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            String mst = sc.nextLine();
            String time = sc.nextLine();
            NhanVien nv = new NhanVien(ten, gioitinh, ngaysinh, diachi, mst, time);
            list.add(nv);
        }
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }
}