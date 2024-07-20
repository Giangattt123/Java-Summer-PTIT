/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class QuanLyTV {
    private List<TaiLieu> list = new ArrayList<>();
    public QuanLyTV(){};

    public List<TaiLieu> getList() {
        return list;
    }

    public void setList(List<TaiLieu> list) {
        this.list = list;
    }
    
    public void nhapTapChi(Scanner in) {
        String tenNhaXB = in.nextLine();
        int soBanPH = Integer.parseInt(in.nextLine());
        String thang = in.nextLine();
        TapChi tc = new TapChi(tenNhaXB, soBanPH, thang);
        tc.setMa();
        list.add(tc);
    }
    public void nhapSach(Scanner in) {
        String tenSach = in.nextLine();
        String tenTG = in.nextLine();
        String tenNhaXB = in.nextLine();
        int soTrang = Integer.parseInt(in.nextLine());
        int soBanPH = Integer.parseInt(in.nextLine());
        Sach s = new Sach(tenSach, tenTG, tenNhaXB, soTrang, soBanPH);
        s.setMa();
        list.add(s);
    }
    
    public void out() {
        List<TaiLieu> ltl = getList();
        for (TaiLieu tl : ltl) {
            if (tl instanceof TapChi) {
                TapChi tc = (TapChi) tl;
                System.out.println(tc);
            }
            if (tl instanceof Sach) {
                Sach s = (Sach) tl;
                System.out.println(s);
            }
        }
    }
    
    public void xoaTapChi(int nam) {
        if (nam != 2022 && nam != 2023) {
            System.out.println("khong tim thay");
            return;
        }
        List<TaiLieu> ltl = getList();
        List<TapChi> ltc = new ArrayList<>();
        for (TaiLieu tl : ltl) {
            if (tl instanceof TapChi) {
                 TapChi tc = (TapChi) tl;
                 if (nam != tc.getNam()) {
                     ltc.add(tc);
                 }
            }
        }
        int size = ltc.size();
        if (size > 0) {
            for (TapChi tc : ltc) {
                System.out.println(tc);
            }
        } else {
            System.out.println("khong tim thay");
        }
    }
    
    public void thongke() {
        List<TaiLieu> ltl = getList();
        Map<Integer , TapChi> map = new HashMap<>();
        for (TaiLieu tc : ltl) {
            if (tc instanceof  TapChi) {
                TapChi t = (TapChi) tc;
                int nam = t.getNam();
                if (!map.containsKey(nam) || map.get(nam).getSoBanPH() < t.getSoBanPH()) {
                    map.put(nam, t);
                }
            }
        }
        for (Map.Entry<Integer , TapChi> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
