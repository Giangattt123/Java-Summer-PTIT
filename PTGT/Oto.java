/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.demo1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Admin
 */
public class Oto extends PTGT implements IPTGT{
    private int soCho;
    private double dongCo;
    public Oto(){};
    public Oto(String hang , String ngayLanBanh , double giaGoc, int soCho , double dongCo) {
        super(hang , ngayLanBanh , giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }
    
    public void setMa() {
        String ma = super.getHang().substring(0 , 2).toUpperCase() + "-" + String.format("%03d", num++);
        super.setMa(ma);
    }
    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public double getGia() {
        String ngay = super.getNgayLanBanh();
        String [] arr = ngay.split("/");
        int namLB = Integer.parseInt(arr[1]);
        int soNamLB = 2023 - namLB;
        double giaTT = 0f;
        if (soNamLB == 0) giaTT = super.getGiaGoc() * 1.1;
        else if (soNamLB >= 1 && soNamLB <= 2) giaTT = super.getGiaGoc() * 0.9;
        else if (soNamLB >= 3 && soNamLB <= 5) giaTT = super.getGiaGoc() * 0.8;
        else giaTT = super.getGiaGoc() * 0.7;
        return giaTT;
    }
    
    @Override
    public String toString() {
        return super.getMa() + " " + super.getHang() + " " + super.getNgayLanBanh() + " " + this.soCho + " " + (int)this.getGia();
    }
}
 