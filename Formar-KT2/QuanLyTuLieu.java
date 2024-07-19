/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyTuLieu {
    private List<TuLieu> list = new ArrayList<>();

    public QuanLyTuLieu() {
    }

    public List<TuLieu> getList() {
        return list;
    }

    public void setList(List<TuLieu> list) {
        this.list = list;
    }
    
    public void nhapBao(Scanner sc) {
        String ten = sc.nextLine();
        String tenNhaXB = sc.nextLine();
        String ngay = sc.nextLine();
        double gia = sc.nextDouble();
        int sL = sc.nextInt();
        sc.nextLine();
        Bao b = new Bao(ten, tenNhaXB, ngay, gia, sL);
        list.add(b);
    }
    
    public void nhapSachHoc(Scanner sc) {
        String ten = sc.nextLine();
        String tenTG = sc.nextLine();
        int soTrang = sc.nextInt();
        sc.nextLine();
        String nhaXB = sc.nextLine();
        double gia = sc.nextDouble();
        sc.nextLine();
        int SL = sc.nextInt();
        sc.nextLine();
        SachHoc sh = new SachHoc(ten, tenTG, soTrang, nhaXB, gia, soTrang);
        list.add(sh);
    }
    
    public void out() {
        List<TuLieu> tls = getList();
        for (TuLieu tl : tls) {
            if (tl instanceof Bao) {
                Bao b = (Bao)tl;
                System.out.println(b);
            }
            if (tl instanceof SachHoc) {
                SachHoc sh = (SachHoc)tl;
                System.out.println(sh);
            }
        }
    }
    
    public void sapxepBaoTheoNgay(int nam) {
        List<TuLieu> tls = getList();
        List<Bao> bs = new ArrayList<>();
        for (TuLieu tl : tls) {
            if (tl instanceof Bao) {
                Bao b = (Bao)tl;
                if (b.getYear()== nam) {
                    bs.add(b);
                }
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Collections.sort(bs , new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                try{
                    Date date1 = sdf.parse(o1.getNgay());
                    Date date2 = sdf.parse(o2.getNgay());
                    return date1.compareTo(date2);
                }catch(ParseException e){
                    System.out.println(e);
                    return 0;
                }
            }
        });
        for (Bao b : bs) {
            System.out.println(b);
        }
    }
    public void thongkeBao() {
        List<TuLieu> tls = getList();
        List<Bao> bs = new ArrayList<>();
        for (TuLieu tl : tls) {
            if (tl instanceof Bao) {
                Bao b = (Bao)tl;
                bs.add(b);
            }
        }
        Map<Integer , Integer> map = new HashMap<>();
        for (Bao b : bs) {
            int nam = b.getYear();
            if (map.containsKey(nam)) {
                int sl = map.get(nam);
                sl += b.getSoLuong();
                map.put(nam, sl);
            }
            else {
                map.put(nam, b.getSoLuong());
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
