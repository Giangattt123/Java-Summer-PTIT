/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Admin
 */
public class QuanLy {
    private List<PTGT> list = new ArrayList<>();
    public QuanLy(){};

    public List<PTGT> getList() {
        return list;
    }

    public void setList(List<PTGT> list) {
        this.list = list;
    }
    
    public void nhapOto(Scanner in) {
        String hang = in.nextLine();
        String ngayLanBanh = in.nextLine();
        double giaGoc = Double.parseDouble(in.nextLine());
        int socho = Integer.parseInt(in.nextLine());
        double dongCo = Double.parseDouble(in.nextLine());
        Oto o = new Oto(hang , ngayLanBanh , giaGoc , socho , dongCo);
        o.setMa();
        list.add(o);
    }
    
    public void nhapXeTai(Scanner in) {
        String hang = in.nextLine();
        String ngayLanBanh = in.nextLine();
        double giaGoc = Double.parseDouble(in.nextLine());
        double trongTai = Double.parseDouble(in.nextLine());
        boolean thung = in.nextBoolean();
        XeTai xt = new XeTai(hang , ngayLanBanh , giaGoc , trongTai , thung);
        xt.setMa();
        list.add(xt);
    }
    
    public void out() {
        List<PTGT> lql = getList();
        for (PTGT ptgt : lql) {
            if (ptgt instanceof Oto) {
                Oto o = (Oto) ptgt;
                System.out.println(o);
            }
            if (ptgt instanceof XeTai) {
                XeTai xt = (XeTai) ptgt;
                System.out.println(xt);
            }    
        }
    }
    
    public void out3() {
        Data data = new Data();
        List<PTGT> list = data.getData();
        for (PTGT ptgt : list) {
            if (ptgt instanceof Oto) {
                Oto o = (Oto) ptgt;
                System.out.println(o);
            }
            if (ptgt instanceof XeTai) {
                XeTai xt = (XeTai) ptgt;
                System.out.println(xt);
            }    
        }
    }
    
    public void timXeTaiTheoNam(int nam , boolean thung) {
        Data data = new Data();
        List<PTGT> list = data.getData();
        for (PTGT i : list) {
            if (i instanceof XeTai) {
                XeTai iXT = (XeTai) i;
                String [] arr = iXT.getNgayLanBanh().split("/");
                int namLanBanh = Integer.parseInt(arr[1]);
                if (namLanBanh == nam && iXT.isThung() == thung) {
                    System.out.println(iXT);
                }
            }
        }
    }
    
    public void sapXepDanhSachOto() {
        Data data = new Data();
        List<PTGT> list = data.getData();
        List<Oto> l_Oto = new ArrayList<>();
        for (PTGT x : list) {
            if (x instanceof Oto) {
                Oto o = (Oto) x;
                l_Oto.add(o);
            }
        }
        Collections.sort(l_Oto , new Comparator<Oto>(){
            @Override
            public int compare(Oto o1, Oto o2) {
                String [] arr1 = o1.getNgayLanBanh().split("/");
                int t1 = Integer.parseInt(arr1[0]);
                int n1 = Integer.parseInt(arr1[1]);
                String [] arr2 = o2.getNgayLanBanh().split("/");
                int t2 = Integer.parseInt(arr2[0]);
                int n2 = Integer.parseInt(arr2[1]);
                if (n1 != n2) return Integer.compare(n2, n1);
                if (t1 != t2) return Integer.compare(t2, t1);
                return Double.compare(o1.getGia(), o2.getGia());
            }
        });
        for (Oto o : l_Oto) {
            System.out.println(o);
        }
    }
    
    public void demXeTaiTheoThung(boolean thung) {
        Data data = new Data();
        List<PTGT> list = data.getData();
        List<XeTai> l_XT = new ArrayList<>();
        for (PTGT x : list) {
            if (x instanceof XeTai) {
                XeTai xt = (XeTai) x;
                l_XT.add(xt);
            }
        }
        Map<Integer , Integer> mapT = new TreeMap<>();
        Map<Integer , Integer> mapF = new TreeMap<>();
        for (XeTai xt : l_XT) {
            String [] arr = xt.getNgayLanBanh().split("/");
            int nam = Integer.parseInt(arr[1]);
            if (xt.isThung() == true) {
               if (mapT.containsKey(nam)) {
                   int ts = mapT.get(nam);
                   mapT.put(nam , ts + 1);
               } else {
                   mapT.put(nam, 1);
               }
            } else {
                if (mapF.containsKey(nam)) {
                   int ts = mapF.get(nam);
                   mapF.put(nam , ts + 1);
               } else {
                    mapF.put(nam, 1);
                }
            }
        }
        if (thung) {
            for (Map.Entry<Integer , Integer> entry : mapT.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } else {
            for (Map.Entry<Integer , Integer> entry : mapF.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
