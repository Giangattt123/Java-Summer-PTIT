/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT1_CT;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Admin
 */
public class b3 {
    static class DaThuc {
        private TreeMap<Integer , Integer> dt;
        public DaThuc(String s) {
            dt = new TreeMap<>();
            solve(s);
        }
        public void solve(String s) {
            s = s.replace(" " , "");
            String [] a = s.split("\\s+");
            for (String X : a) {
                String [] x = X.split("\\*x\\^");
                int hs = Integer.parseInt(x[0]);
                int mu = Integer.parseInt(x[1]);
                if (dt.containsKey(hs)) {
                    dt.put(hs, dt.get(hs) + 1);
                } else {
                    dt.put(hs, 1);
                }
            }
        }
        public DaThuc cong(DaThuc other) {
            DaThuc res = new DaThuc("");
            for (Map.Entry<Integer , Integer> entry : this.dt.entrySet()) {
                res.dt.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<Integer , Integer> entry : other.dt.entrySet()) {
                res.dt.put(entry.getKey(), res.dt.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
            return res;
        }

        public void out() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer , Integer> entry : dt.descendingMap().entrySet()) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(entry.getValue()).append("*x^").append(entry.getKey());
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);       
            DaThuc p = new DaThuc(sc.nextLine());
            DaThuc q = new DaThuc(sc.nextLine());
            DaThuc r = p.cong(q);
            r.out();
    }
}
