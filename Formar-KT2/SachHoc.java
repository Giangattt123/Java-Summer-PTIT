/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo2;

/**
 *
 * @author Admin
 */
public class SachHoc extends TuLieu implements ITuLieu{
    private String ten , tenTG;
    private int soTrang;
    public SachHoc() {};
    public SachHoc(String ten , String tenTG , int soTrang , String tenNhaXB , double gia , int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ten = ten;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
        double price = 0f;
        if (soTrang < 300) price = gia * 0.95;
        else if (soTrang > 301 && soTrang < 500) price = gia * 0.9;
        else price = gia * 0.85;
        if (soLuong > 500) price *= 0.9;
        super.setGia(price);
        String ma = "";
        String [] arr = ten.split("\\s+");
        ma = arr[0].toUpperCase() + String.format("%03d", num++);
        super.setMa(ma);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public String toString() {
        return super.getMa() + " " + this.ten + " " + super.getTenNhaXB() + " " + this.soTrang + " " + (int) super.getGia();
    }
}
