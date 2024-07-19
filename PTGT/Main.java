/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit.demo1;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
//    Câu 1
//    public static void main(String[] args) {
//        Oto o = new Oto("Yaris" , "02/2023" , 32000 , 4 , 1.5);
//        o.setMa();
//        System.out.println(o);
//        XeTai t = new XeTai("Ranger" , "10/2018" , 16000 , 3.5 , true);
//        t.setMa();
//        System.out.println(t);
//    }
    
//    Câu 2
//    public static void main(String[] args) {
//        QuanLy ql = new QuanLy();
//        Scanner in=new Scanner(System.in);
//        ql.nhapOto(in);
//        ql.nhapXeTai(in);
//        ql.out();
//    }
    /* Input
    Yaris
    09/2020
    30000
    4
    1.5
    Ranger
    04/2023
    23000
    3.5
    true
    */
    
//    Câu 3
//    public static void main(String[] args) throws ParseException {
//        QuanLy ql = new QuanLy();
//        Scanner in=new Scanner(System.in);
//        ql.out3();
//        int nam = Integer.parseInt(in.nextLine());
//        boolean thung = in.nextBoolean();
//        ql.timXeTaiTheoNam(nam, thung);
//    }
    /* Output
    -- Ô tô --
    YA-001 Yaris 10/2020 4 24000
    VI-002 Vios 05/2018 4 14400
    IN-003 Innova 06/2020 7 20000
    LE-004 Lexus RX 450h 06/2020 7 36000
    -- Xe tải --
    T-005 Ranger 11/2023 3,5 37510
    T-006 Suzuki Carry Truck 05/2018 5,0 16000
    T-007 Hyundai HD99 05/2020 6,5 10560
    T-008 Hyundai HD700 05/2018 7,0 16000
    2018
    false
    T-014 Suzuki Carry Truck 05/2018 5,0 16000
    T-016 Hyundai HD700 05/2018 7,0 16000
    */
    
//    Câu 4
//    public static void main(String[] args){
//        QuanLy ql = new QuanLy();
//        ql.sapXepDanhSachOto();
//    }
    
    public static void main(String[] args){
        QuanLy ql = new QuanLy();
        Scanner in=new Scanner(System.in);
        boolean thung = in.nextBoolean();
        ql.demXeTaiTheoThung(thung);
    }
    
}
