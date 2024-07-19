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
public class J04005 {
    static class ThiSinh{
        private String name , ns;
        private Float tongDiem;
        public ThiSinh(){};
        public ThiSinh(String name , String ns , float tongDiem) {
            this.name = name;
            this.ns = ns;
            this.tongDiem = tongDiem;
        }
        @Override
        public String toString() {
            return name + " " + ns + " " + String.format("%.1f", tongDiem);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ns = sc.nextLine();
        float dm1 = sc.nextFloat();
        float dm2 = sc.nextFloat();
        float dm3 = sc.nextFloat();
        float tongDiem = dm1 + dm2 + dm3;
        ThiSinh ts = new ThiSinh(name , ns , tongDiem);
        System.out.println(ts);
    }
}
