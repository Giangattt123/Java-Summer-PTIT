/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class b2 {
    static int num = 1;
    static final class Lop{
        private String ma , ten , sta;
        private double dtb;
        private double dut;
       
       
        public Lop(String ten , double dm1 , double dm2 , double dm3 , String pL) {
            this.ma = String.format("HS%03d", num++);
            this.ten = chuanHoaTen(ten);
            if (pL.equals("LT")) dut = 0.4;
            else if (pL.equals("LP")) dut = 0.2;
            else dut = 0;
            this.dtb = (dm1 + dm2 + dm3)/3 + dut;
            if (dm1 == 0 || dm2 == 0 || dm3 == 0 || (this.dtb < 5)) this.sta = "HOC LAI";
            else if (dm1 < 5 || dm2 < 5 || dm3 < 5 || (this.dtb >= 5 && this.dtb < 6.5)) this.sta = "Trung binh";
            else if (this.dtb >= 6.5 && this.dtb < 8) this.sta = "Kha";
            else if (this.dtb >= 8) this.sta = "Gioi";
        }
        public  String chuanHoaTen(String s) {
            String[] arr = s.trim().toLowerCase().split("\\s+");
            String ans = "";
            for (String tmp : arr) {
                ans += tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase() + " ";
            }
            ans = ans.trim();
            return ans;
        }
        
        @Override
        public String toString() {
            return this.ma + " " + this.ten + " " + String.format("%.1f", this.dtb) + " " + this.sta;
        }
    } 
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\JavaSummer\\CodePtit\\BKT3\\diemthi.dat");
        Scanner sc = new Scanner(file);
        List<Lop> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < n ; i++) {
            String ten = sc.nextLine();
            String [] diem = sc.nextLine().split(" ");
            double dm1 = Double.parseDouble(diem[0]);
            double dm2 = Double.parseDouble(diem[1]);
            double dm3 = Double.parseDouble(diem[2]);
            String pL = sc.nextLine();
            Lop l = new Lop(ten, dm1, dm2, dm3, pL);
            System.out.println(l);
        }
    }
}
