/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BaiKiemTraSo2;

/**
 *
 * @author Admin
 */
public class Bao extends TuLieu implements ITuLieu{
    private String ngay;
    private String ten;
    public Bao() {};
    public Bao(String ten , String tenNhaXB , String ngay , double gia , int soLuong) {
        super(tenNhaXB, gia, soLuong);
        this.ngay = ngay;
        this.ten = ten;
        String ma = Character.toUpperCase(ten.charAt(0)) + String.format("%03d", num++);
        super.setMa(ma);
        String[] arr = this.ngay.split("/");
        if (soLuong > 200) gia = gia * 0.95;
        if (Integer.parseInt(arr[1]) == 1 || Integer.parseInt(arr[1]) == 2) gia = gia * 0.95;
        super.setGia(gia);
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getYear() {
        String [] arr = this.ngay.split("/");
        int nam = Integer.parseInt(arr[2]);
        return nam;
    }
    
    @Override
    public String toString() {
        return super.getMa() + " " + this.ten + " " + this.ngay + " " + super.getTenNhaXB() + " " + (int)super.getGia();
    }
}
