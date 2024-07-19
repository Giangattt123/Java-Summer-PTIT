/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class KhachHang implements Comparable<KhachHang> {
    public static Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("1", 25);
        put("2", 34);
        put("3", 50);
        put("4", 80);
    }};
    public static int num = 1;
    private String id, name, roomId;
    private int day , price , total;
    public KhachHang() {};
    public KhachHang(String name , String roomId , Date checkinDate , Date checkoutDate , int serviceFee) {
        this.id = "KH" + String.format("%02d", num++);
        this.name = normalizeName(name);
        this.roomId = roomId;
        this.day = calculateTime(checkinDate, checkoutDate);
        this.price = this.price = map.get(roomId.substring(0, 1));
        this.total = this.price * this.day + serviceFee;
    }
    private String normalizeName(String s) {
        String[] words = s.split("\\s+");
        String res = "";
        for (int i = 0; i < words.length; i++) {
            res += words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            if (i != words.length - 1) {
                res += " ";
            }
        }
        return res;
    }
    private int calculateTime(Date checkIn, Date checkOut) {
        long in = checkIn.getTime();
        long out = checkOut.getTime();
        return (int) ((out - in) / (1000 * 60 * 60 * 24)) + 1;
    }

    public int getTotal() {
        return total;
    }
    
    @Override
    public int compareTo(KhachHang other) {
        if (this.getTotal() > other.getTotal()) return -1;
        else if (this.getTotal() < other.getTotal()) return 1;
        else return 0;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + roomId + " " + day + " " + total;
    }
}
public class J07051 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> customers = new ArrayList<>();
        while (n-- > 0) {
            String name = sc.nextLine().trim();
            String roomId = sc.nextLine().trim();
            Date checkInDate = sdf.parse(sc.nextLine());
            Date checkOutDate = sdf.parse(sc.nextLine());
            int serviceFee = Integer.parseInt(sc.nextLine());
            KhachHang customer = new KhachHang(name, roomId, checkInDate, checkOutDate, serviceFee);
            customers.add(customer);
        }
        Collections.sort(customers);
        for (KhachHang customer : customers) {
            System.out.println(customer);
        }
    }
}
