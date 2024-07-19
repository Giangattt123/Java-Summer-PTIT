/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
class MatHangJ07050 implements Comparable<MatHangJ07050>{
    public static int num = 1;
    private String maHang, tenHang, nhomHang;
    private Float giaMua, giaBan, loiNhuan;
    
    public MatHangJ07050(){};
    public MatHangJ07050(String tenHang , String nhomHang , Float giaMua , Float giaBan) {
        this.maHang = "MH" + String.format("%02d", num++);
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.loiNhuan = giaBan - giaMua;
    }

    public Float getLoiNhuan() {
        return loiNhuan;
    }
    
    @Override
    public int compareTo(MatHangJ07050 other) {
        if (this.getLoiNhuan() > other.getLoiNhuan()) return -1;
        else if (this.getLoiNhuan() < other.getLoiNhuan()) {
            return 1;
        } else return 0;
    }
    
    @Override
    public String toString(){
         return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }
}
public class J07050 {
    public static Scanner sc;
    public static void main(String[] args) throws FileNotFoundException {
//        Test
        sc = new Scanner(new File("src\\JavaSummer\\CodePtit\\MATHANG.in"));
//        File file = new File("MATHANG.in");
//        sc = new Scanner(file);
        int t = Integer.parseInt(sc.nextLine());
//        MatHangJ07050[] mh = new MatHangJ07050[t];
//        for (int i = 0 ; i < t ; i++) {
//            String tenHang = sc.nextLine();
//            String nhomHang = sc.nextLine();
//            Float giaMua = Float.parseFloat(sc.nextLine());
//            Float giaBan = Float.parseFloat(sc.nextLine());
//            mh[i] = new MatHangJ07050(tenHang, nhomHang, giaMua, giaBan);
//        }
//        Arrays.sort(mh);
//        for (MatHangJ07050 x : mh) {
//            System.out.println(x);
//        }
        List<MatHangJ07050> list = new ArrayList<MatHangJ07050>();
        while (t-- > 0) {
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            Float giaMua = Float.parseFloat(sc.nextLine());
            Float giaBan = Float.parseFloat(sc.nextLine());
            MatHangJ07050 mh = new MatHangJ07050(tenHang , nhomHang , giaMua , giaBan);
            list.add(mh);
        }
        Collections.sort(list);
        for (MatHangJ07050 x : list) {
            System.out.println(x);
        }
    }
}
