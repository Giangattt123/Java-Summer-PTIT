
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DucGiang
 */
public class J07052 {
    static TreeMap<String, Double> map = new TreeMap<String, Double>() {{
        put("KV1", 0.5);
        put("KV2", 1.0);
        put("KV3", 2.5);
    }};

    static final class ThiSinh implements Comparable<ThiSinh>{
        private String ma , ten , tt;
        private double dut , dxt;
        
        public ThiSinh(String ma , String ten , double dt , double dl , double dh) {
            this.ma = ma;
            this.ten = ten;
            this.dut = map.get(ma.substring(0 , 3));
            this.dxt = dt * 2 + dl + dh + this.dut;
            chuanHoaTen();
        };
        
        public void chuanHoaTen() {
            ten = this.ten.toLowerCase().trim();
            String [] arrTen = ten.split("\\s+");
            String ans = "";
            for (int i = 0 ; i < arrTen.length ; i++) {
                ans += Character.toUpperCase(arrTen[i].charAt(0)) + arrTen[i].substring(1) + " ";
            }
            ans.trim();
            this.ten = ans;
        }
        public void setTT(String tmp) {
            this.tt = tmp;
        }

        public static String removeZero(double number) {
            DecimalFormat fm = new DecimalFormat("#.#");
            return fm.format(number);
        }
        
        @Override
        public int compareTo(ThiSinh o) {
            if (this.dxt != o.dxt) {
                if (this.dxt > o.dxt) return -1;
                else return 1;
            } else {
                return this.ma.compareTo(o.ma);
            }
        }
        
        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + removeZero(dut) + " " + removeZero(dxt) + " " + this.tt;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\JavaSummer\\CodePtit\\THISINH.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> lists = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            Double dt = Double.parseDouble(sc.nextLine());
            Double dl = Double.parseDouble(sc.nextLine());
            Double dh = Double.parseDouble(sc.nextLine());
            ThiSinh list = new ThiSinh(ma, ten, dt, dl, dh);
            lists.add(list);
        }
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(lists);
        double diemChuan = lists.get(chiTieu - 1).dxt;
        for (ThiSinh ts : lists) {
            if (ts.dxt >= diemChuan) 
                ts.setTT("TRUNG TUYEN");
            else 
                ts.setTT("TRUOT");
        }
        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh ts : lists) {
            System.out.println(ts);
        }
    }
}
