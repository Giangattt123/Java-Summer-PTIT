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
public class J04003 {
    static class PhanSo {
        private long ts , ms;
        public PhanSo(long ts , long ms) {
            this.ts = ts;
            this.ms = ms;
            this.rutGon();
        }
        private long ucln(long a, long b) {
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
        @Override
        public String toString() {
            return ts + "/" + ms;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() , b = sc.nextLong();
        PhanSo ps = new PhanSo(a, b);
        System.out.println(ps);
    }
}
