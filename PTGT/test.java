/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.demo1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngayHienTai = LocalDate.now();
        System.out.println(ngayHienTai);
        LocalDate ngayTruocDo = LocalDate.parse(s , formatter);
        System.out.println(ngayTruocDo);
        int soNam = Period.between(ngayTruocDo, ngayHienTai).getYears();
        int soThang = Period.between(ngayTruocDo, ngayHienTai).getMonths();
        int soNgay = Period.between(ngayTruocDo, ngayHienTai).getDays();
        System.out.println(soNam + " " + soThang + " " + soNgay);
    }
}
