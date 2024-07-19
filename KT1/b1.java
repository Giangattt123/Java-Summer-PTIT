/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT1_CT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class b1 {
    static class Matran{
        int [][] a;
        int n;
        public Matran(int [][] a) {
            this.a = a;
        }
        public Matran(int n) {
            a = new int[n][n];
        }
        public int getKT() {
            return a[0].length;
        }
        public int [][] getMatran() {
            return a;
        }
        public void input(Scanner sc) {
            for (int i = 0 ; i < getKT() ; i++) {
                for (int j = 0 ; j < getKT() ; j++)
                    a[i][j] = sc.nextInt();
            }
        }
        public Matran tich(int [][] b) {
            Matran ans = new Matran(b);
            int [][] s = new int [getKT()][getKT()];
            for (int i = 0 ; i < getKT() ; i++) {
                for (int j = 0 ; j < getKT() ; j++) {
                    s[i][j] = 0;
                    for (int k = 0 ; k < getKT() ; k++) {
                        s[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return new Matran(s);
        }
        public void out() {
            int n = getKT();
             for (int i = 0 ; i < n ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    System.out.println(a[i][j] + " ");
                }
                   System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t=m.tich(b.getMatran());
        //viet ra ma tran tich
        t.out();
    }
}
