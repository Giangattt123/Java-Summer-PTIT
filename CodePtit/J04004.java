/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J04004 {
    static class PhanSo{
        private long ts , ms;
        public PhanSo(){};
        public PhanSo(long ts , long ms) {
            this.ts = ts;
            this.ms = ms;
            this.rutGon();
        }
        public long ucln(long a, long b) {
            while (b != 0) {
                long r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
        public void rutGon() {
            long gcd = ucln(ts, ms);
            ts = ts / gcd;
            ms = ms / gcd;
        }
        public PhanSo tinhTong(PhanSo o) {
            PhanSo c = new PhanSo();
            o.rutGon();
            c.ts = this.ts * o.ms + this.ms * o.ts;
            c.ms = this.ms * o.ms;
            c.rutGon();
            return c;
        }
        @Override
        public String toString() {
            return ts + "/" + ms;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next() , b = sc.next() , c = sc.next() , d = sc.next();
        PhanSo ps1 = new PhanSo(Long.parseLong(a) , Long.parseLong(b));
        PhanSo ps2 = new PhanSo(Long.parseLong(c) , Long.parseLong(d));
        PhanSo res = ps1.tinhTong(ps2);
        System.out.println(res);
    }
}
