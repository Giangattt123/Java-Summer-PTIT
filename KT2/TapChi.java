/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.BKT2;

/**
 *
 * @author Admin
 */
public class TapChi extends TaiLieu implements ITaiLieu{
    
    private String thang;
    public TapChi(String tenNhaXB , int soBanPH , String thang) {
        super(tenNhaXB , soBanPH);
        this.thang = thang;
    }
    
    public void setMa() {
        String [] arr = super.getTenNhaXB().toUpperCase().split("\\s+");
        String ans = "";
        for (int i = 0 ; i < arr.length ; i++) {
            ans += arr[i].substring(0, 1);
        }
        String ma = ans + String.format("%03d", num++);
        super.setMa(ma);
    }
    
    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }
    
    @Override
    public int getSoAnPham() {
        int so = 0;
        int soBan = super.getSoBanPH();
        if (soBan >= 0 && soBan <= 100)
            so = (int) (soBan * 0.02);
        else if(soBan >= 101 && soBan <= 200)
            so = (int) (soBan * 0.05);
        else so = (int) (soBan * 0.08);
        
        if (super.getTenNhaXB().equals("KHCNTT  TT"))
            so = (int) (so * 1.02);
        return so;
    }
    
    @Override
    public String toString() {
        return super.getMa() + " " + super.getTenNhaXB() + " " + 
                super.getSoBanPH() + " " + this.thang + " " + this.getSoAnPham();
    }
    
    public int getNam() {
        String [] arr = this.thang.split("/");
        return Integer.parseInt(arr[1]);
    }
}
/*
KHCNTT TT
120
10/2023
LT HDT
Nguyen Manh Son
giao duc
120
1000
*/