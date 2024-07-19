package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class KhachHang1 {
    private String maKH;
    private String hoTen;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private long soNgayLuuTru;

    private static int num = 1;

    public KhachHang1(String hoTen, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.maKH = String.format("KH%02d", num++);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.ngayDen = dateFormat.parse(ngayDen);
        this.ngayDi = dateFormat.parse(ngayDi);
        this.soNgayLuuTru = (this.ngayDi.getTime() - this.ngayDen.getTime()) / (1000 * 60 * 60 * 24);
    }

    public long getSoNgayLuuTru() {
        return soNgayLuuTru;
    }

    @Override
    public String toString() {
        return maKH + " " + hoTen + " " + maPhong + " " + soNgayLuuTru;
    }
}

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file = new File("src\\JavaSummer\\CodePtit\\KHACH.in");
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<KhachHang1> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine().trim();
            String maPhong = sc.nextLine().trim();
            String ngayDen = sc.nextLine().trim();
            String ngayDi = sc.nextLine().trim();
            list.add(new KhachHang1(hoTen, maPhong, ngayDen, ngayDi));
        }

        sc.close();

        Collections.sort(list, new Comparator<KhachHang1>() {
            @Override
            public int compare(KhachHang1 o1, KhachHang1 o2) {
                return Long.compare(o2.getSoNgayLuuTru(), o1.getSoNgayLuuTru());
            }
        });

        for (KhachHang1 kh : list) {
            System.out.println(kh);
        }
    }
}
