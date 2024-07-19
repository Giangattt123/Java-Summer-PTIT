/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Subject1 implements Comparable<Subject1> {

    private String maMon, tenMon, hinhThucThi;

    public Subject1 (String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMaMon() {
        return maMon;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThucThi;
    }
   
    @Override
    public int compareTo(Subject1 o) {
        return this.maMon.compareTo(o.getMaMon());
    }
}

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject1> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            list.add(new Subject1(maMon, tenMon, hinhThucThi));
        }

        Collections.sort(list);
        for (Subject1 x : list) {
            System.out.println(x);
        }
    }
}
