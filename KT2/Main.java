/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
//        TapChi t=new TapChi("KHCNTT TT", 250, "10/2023");
//        t.setMa();
//        System.out.println(t);
//        Sach s=new Sach("LT HDT", "Nguyen manh Son", "giao duc", 220, 1000);
//        s.setMa();
//        System.out.println(s);
//        QuanLyTV q=new QuanLyTV();
//        Scanner in=new Scanner(System.in);
//        q.nhapTapChi(in);
//        q.nhapSach(in);
//        q.out();

//        QuanLyTV q=new QuanLyTV();
//        List<TaiLieu> list=new ArrayList<>();
//        TapChi t=new TapChi("tap chi giao duc",220,"02/2023");
//        t.setMa();
//        list.add(t);
//        t=new TapChi("tap chi thieu nhi",300,"06/2023");
//        t.setMa();
//        list.add(t);
//        t=new TapChi("tap chi cong san",80,"05/2023");
//        t.setMa();
//        list.add(t);
//        t=new TapChi("KHCNTT TT",180,"02/2022");
//        t.setMa();
//        list.add(t);
//        t=new TapChi("tap chi van hien",110,"08/2022");
//        t.setMa();
//        list.add(t);     
//        q.setList(list);
//        Scanner in=new Scanner(System.in);
//        int nam=Integer.parseInt(in.nextLine());
//        q.xoaTapChi(nam);

        QuanLyTV q=new QuanLyTV();
        List<TaiLieu> list=new ArrayList<>();
        TapChi t=new TapChi("tap chi giao duc",220,"02/2023");
        t.setMa();
        list.add(t);
        t=new TapChi("tap chi thieu nhi",300,"06/2023");
        t.setMa();
        list.add(t);
        t=new TapChi("tap chi cong san",80,"05/2023");
        t.setMa();
        list.add(t);
        t=new TapChi("KHCNTT TT",180,"02/2022");
        t.setMa();
        list.add(t);
        t=new TapChi("tap chi van hien",110,"08/2022");
        t.setMa();
        list.add(t);     
        q.setList(list);        
        q.thongke();
    }
    
   
}
