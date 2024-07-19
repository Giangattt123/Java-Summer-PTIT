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
public class XeTai extends PTGT implements IPTGT{
    private double trongTai;
    private boolean thung;
    public XeTai(){};
    public XeTai(String hang , String ngayLanBanh , double giaGoc , double trongTai , boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.trongTai = trongTai;
        this.thung = thung;
    }

    public void setMa() {
        String ma = "T-" + String.format("%03d", num++);
        super.setMa(ma);
    }
    
    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public boolean isThung() {
        return thung;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }

    @Override
    public double getGia() {
        String ngay = super.getNgayLanBanh();
        String [] arr = ngay.split("/");
        int namLB = Integer.parseInt(arr[1]);
        int soNamLB = 2023 - namLB;
        double giaTT = 0f;
        if (soNamLB == 0) giaTT = super.getGiaGoc() * 1.1;
        else if (soNamLB >= 1 && soNamLB < 3) giaTT = super.getGiaGoc() * 0.9;
        else giaTT = super.getGiaGoc() * 0.8;
        if (this.thung == true) {
            giaTT *= 1.1;
        }
        return giaTT;
    }
    
    @Override
    public String toString() {
        return super.getMa() + " " + super.getHang() + " " + super.getNgayLanBanh() + " " + 
                String.format("%.1f", this.trongTai) + " " + (int)this.getGia();
    } 
}
