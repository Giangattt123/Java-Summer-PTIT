/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT2;

/**
 *
 * @author Admin
 */
public class Sach extends TaiLieu implements ITaiLieu{
    private String tenSach , tenTG;
    private int soTrang;
    public Sach(String tenSach , String tenTG , String tenNhaXB , int soTrang , int soBanPH) {
        super(tenNhaXB , soBanPH);
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }
    
    public void setMa() {
        String [] arr = this.tenTG.toUpperCase().split("\\s+");
        String ma = arr[arr.length - 1] + String.format("%03d", num++);
        super.setMa(ma);
    }
    
    public int getSoAnPham() {
        int so = 0;
        int soBan = super.getSoBanPH();
        if (soBan >= 0 && soBan <= 200)
            so = (int) (soBan * 0.05);
        else if(soBan >= 201 && soBan <= 500)
            so = (int) (soBan * 0.08);
        else so = (int) (soBan * 0.1);
        
        if (super.getTenNhaXB().equals("giao duc"))
            so = (int) (so * 0.98);
        return so;
    }
    
    @Override
    public String toString() {
        return super.getMa() + " " + this.tenSach + " " + this.tenTG + " " 
                + super.getTenNhaXB() + " " + super.getSoBanPH() + " " + this.getSoAnPham();
    }
}
