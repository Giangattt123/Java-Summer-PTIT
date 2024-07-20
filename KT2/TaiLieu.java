/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT2;

/**
 *
 * @author Admin
 */
public class TaiLieu {
    static int num = 1;
    private String ma , tenNhaXB;
    private int soBanPH , soAnPham;
    public TaiLieu(){}
    

    public TaiLieu(String tenNhaXB, int soBanPH) {
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    public void setSoAnPham(int soAnPham) {
        this.soAnPham = soAnPham;
    }

    public String getMa() {
        return ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public int getSoAnPham() {
        return soAnPham;
    }
    
    
    
}
