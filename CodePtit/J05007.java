/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



class NV {
    String id, name, gender, address, tax, signDate;
    Date dob;

    public NV(int i, String name, String gender, String dob, String address, String tax, String signDate)
            throws ParseException {
        this.id = String.format("%05d", i);
        this.name = name;
        this.gender = gender;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.address = address;
        this.tax = tax;
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + new SimpleDateFormat("dd/MM/yyyy").format(dob) + " " + address
                + " " + tax + " " + signDate;
    }

}
public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<NV> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++)
            nv.add(new NV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine()));
        nv.sort((a, b) -> a.dob.compareTo(b.dob));
        for (NV i : nv)
            System.out.println(i);
        sc.close();
    }
}
