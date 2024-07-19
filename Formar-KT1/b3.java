/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b3 {
    static final class PhanSo{
        public long ts , ms;
        public PhanSo(){};
        public PhanSo(long ts , long ms) {
            this.ts = ts;
            this.ms = ms;
            this.rutGon();
        }
        public long ucln(long a , long b) {
            while (b != 0) {
                long r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
        public void rutGon() {
            long ucln = ucln(ts, ms);
            this.ts = ts / ucln;
            this.ms = ms / ucln;
        }
        public PhanSo chia(PhanSo other) {
            PhanSo res = new PhanSo();
            other.rutGon();
            long resT = this.ts * other.ms;
            long resM = this.ms * other.ts;
            res.ts = resT;
            res.ms = resM;
            res.rutGon();
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong() , b = sc.nextLong() , c = sc.nextLong() , d = sc.nextLong();
        PhanSo ps1 = new PhanSo(a, b);
        PhanSo ps2 = new PhanSo(c, d);
        PhanSo ans = ps1.chia(ps2);
        if (ans.ts % ans.ms == 0) {
            System.out.println(ans.ts / ans.ms);
        } else {
            System.out.println(ans.ts + "/" + ans.ms);
        }
    }
}
