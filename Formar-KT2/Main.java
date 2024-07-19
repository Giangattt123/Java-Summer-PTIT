/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Main {
   public static void main(String[] args) {
       // Câu 1
//        Bao b = new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
//        System.out.println(b);
//        SachHoc s = new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
//        System.out.println(s);

       // Câu 2
//        QuanLyTuLieu q=new QuanLyTuLieu();
//        Scanner in=new Scanner(System.in);
//        q.nhapBao(in);
//        q.nhapSachHoc(in);
//        q.out();

       // Câu 3
//        QuanLyTuLieu q=new QuanLyTuLieu();
//        List<TuLieu> a=new ArrayList<>();
//        Bao b=new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
//        a.add(b);
//        b=new Bao("Viet nam news", "thong tan xa", "01/04/2023", 12000, 120);
//        a.add(b);
//        b=new Bao("Tin tuc", "thong tan xa", "15/04/2023", 8000, 150);
//        a.add(b);
//        b=new Bao("Bao anh", "thong tan xa", "12/06/2023", 50000, 220);
//        a.add(b);
//        b=new Bao("Thien than nho", "Tien Phong", "10/08/2023", 20000, 180);
//        a.add(b);
//        b=new Bao("gia dinh", "Bo y te", "04/02/2022", 10000, 90);
//        a.add(b);
//        b=new Bao("suc khoe", "Bo y te", "01/02/2022", 15000, 80);
//        a.add(b);
//        SachHoc s=new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
//        a.add(s);
//        q.setList(a);
//        Scanner in=new Scanner(System.in);
//        q.sapxepBaoTheoNgay(Integer.parseInt(in.nextLine()));
        
     // Câu 4
        QuanLyTuLieu q=new QuanLyTuLieu();
        List<TuLieu> a=new ArrayList<>();
        Bao b=new Bao("Hoa hoc tro", "Tien Phong", "02/04/2023", 23000, 100);
        a.add(b);
        b=new Bao("Viet nam news", "thong tan xa", "01/04/2023", 12000, 120);
        a.add(b);
        b=new Bao("Tin tuc", "thong tan xa", "15/04/2023", 8000, 150);
        a.add(b);
        b=new Bao("Bao anh", "thong tan xa", "12/06/2023", 50000, 220);
        a.add(b);
        b=new Bao("Thien than nho", "Tien Phong", "10/08/2023", 20000, 180);
        a.add(b);
        b=new Bao("gia dinh", "Bo y te", "04/02/2022", 10000, 90);
        a.add(b);
        b=new Bao("suc khoe", "Bo y te", "01/02/2022", 15000, 80);
        a.add(b);
        SachHoc s=new SachHoc("Toan cao cap", "Nhat tue", 120, "Giao duc", 80000, 300);
        a.add(s);
        q.setList(a);
        q.thongkeBao();
    }
}
