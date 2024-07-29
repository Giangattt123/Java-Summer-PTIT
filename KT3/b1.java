
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class NhanVien{
    String maNV;
    String tenNV;
    boolean gioiTinh;
    double luong;

    public NhanVien(String maNV, String tenNV, boolean gioiTinh, double luong){
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }

    @Override
    public String toString(){
        return maNV + " " + tenNV + " " + (gioiTinh ? "nam" : "nu") + " " + Math.round(luong);
    }
}

public class b1{
    public static void main(String[] args){
        List<NhanVien> danhSachNV = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src\\JavaSummer\\CodePtit\\BKT3\\nhanvien.dat"))){
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] infos = line.split("/");
                String maNV = infos[0].trim();
                String tenNV = infos[1].trim();
                boolean gioiTinh = Boolean.parseBoolean(infos[2].trim());
                double luong = Double.parseDouble(infos[3].trim());
                NhanVien nv = new NhanVien(maNV, tenNV, gioiTinh, luong);
                danhSachNV.add(nv);
            }
        } catch (FileNotFoundException e){
            e.getMessage();
        }
        Collections.sort(danhSachNV, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien nv1, NhanVien nv2){
               String[] t1 = nv1.tenNV.split("\\s+");
               String[] t2 = nv2.tenNV.split("\\s+");
               String ten1 = t1[t1.length -1];
               String ten2 = t2[t2.length -1];
               if(ten1.equalsIgnoreCase(ten2)){
                   return nv1.tenNV.compareTo(nv2.tenNV);
               }
               return ten1.compareTo(ten2);
            }
        });
        for (NhanVien nv : danhSachNV){
            System.out.println(nv);
        }
    }
}