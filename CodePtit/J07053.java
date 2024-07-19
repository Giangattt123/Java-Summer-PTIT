
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class CongtyPH {

    private static int num = 1;
    private String name, ngaysinh, id;
    private double pointLT, pointTH, diemThuong;

    public CongtyPH(String name, String ngaysinh, double pointLT, double pointTH) {
        this.id = "PH" + String.format("%02d", num++);
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.pointLT = pointLT;
        this.pointTH = pointTH;
    }

    public String getName() {
        String[] arr = this.name.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (int i = 0; i < arr.length - 1; i++) {
            ans += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        ans += arr[arr.length - 1].substring(0, 1).toUpperCase() + arr[arr.length - 1].substring(1).toLowerCase();
        return ans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(ngaysinh);
        ngaysinh = sdf.format(date);
        return ngaysinh;
    }

    public int getTuoi() {
        String[] arr = ngaysinh.split("/");
        int namSinh = Integer.parseInt(arr[arr.length - 1]);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//        Date date = new Date();
//        int namHienTai = Integer.parseInt(sdf.format(date));
        return 2021 - namSinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getPointLT() {
        return pointLT;
    }

    public void setPointLT(double pointLT) {
        this.pointLT = pointLT;
    }

    public double getPointTH() {
        return pointTH;
    }

    public void setPointTH(double pointTH) {
        this.pointTH = pointTH;
    }

    public double diem() {
        double diem = (pointLT + pointTH) / 2;
        if (pointLT >= 8 && pointTH >= 8) {
            diem += 1;
        } else if (pointLT >= 7.5 && pointTH >= 7.5) {
            diem += 0.5;
        }
        diem = Math.min(diem, 10.0);
        diem = Math.round(diem);
        return diem;
    }

    public String xepLoai() {
        String xeploai = "";
        if (diem() < 5) {
            xeploai = "Truot";
        } else if (diem() >= 5 && diem() <= 6) {
            xeploai = "Trung binh";
        } else if (diem() == 7) {
            xeploai = "Kha";
        } else if (diem() == 8) {
            xeploai = "Gioi";
        } else {
            xeploai = "Xuat sac";
        }
        return xeploai;
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + getTuoi() + " " + (int)diem() + " " + xepLoai();
    }

}

public class J07053 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<CongtyPH> lists = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double pointLT = Double.parseDouble(sc.nextLine());
            double pointTH = Double.parseDouble(sc.nextLine());
            lists.add(new CongtyPH(name, ngaysinh, pointLT, pointTH));
        }
        for (CongtyPH x : lists) {
            System.out.println(x);
        }
    }
}
