/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Student5005 {
    String id, name, className, dob;
    Double gpa;

    public Double getGpa() {
        return this.gpa;
    }

    public Student5005(int index, String name, String className, String dob, Double gpa) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", index);
        this.name = name;
        this.className = className;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + dob + " " + String.format("%.2f", gpa);
    }
}

public class J05005 {
     public static String nameFormat(String ten) {
        String[] s = ten.toLowerCase().trim().split("\\s+");
        for (int i = 0; i < s.length; i++)
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        return String.join(" ", s);
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student5005> st = new ArrayList<>();
        for (int i = 1; i <= t; i++)
            st.add(new Student5005(i, nameFormat(sc.nextLine()), sc.nextLine(), sc.nextLine(),
                    Double.parseDouble(sc.nextLine())));
        st.sort((a, b) -> b.getGpa() > a.getGpa() ? 1 : -1);
        st.forEach(System.out::println);
        sc.close();
    }
}

