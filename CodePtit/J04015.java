/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J04015 {
    public static Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("HT", 2000000);
        put("HP", 900000);
        put("GV", 500000);
    }};
    static class GiaoVien{
        private String mn , name;
        private int hs , pc , tl;
        public GiaoVien(){};
        public GiaoVien(String mn , String name , int lcb) {
            this.mn = mn;
            this.name = name;
            this.hs = Integer.parseInt(mn.substring(2));
            this.pc = map.get(mn.subSequence(0, 2));
            this.tl = this.pc + lcb * this.hs;
        }
        @Override
        public String toString() {
            return this.mn + " " + this.name + " " + this.hs + " " + this.pc + " " + this.tl;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.nextLine();
        String name = sc.nextLine();
        int lcb = sc.nextInt();
        GiaoVien gv = new GiaoVien(mn , name , lcb);
        System.out.println(gv);
    }
}
