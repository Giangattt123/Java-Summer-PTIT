/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class decimalFormat {
    public static void main(String[] args) {
        // Format number simple
        DecimalFormat df = new DecimalFormat("##.##");
        double num1 = 12345.6789;
        System.out.println(df.format(num1));
        // Simple with 0 => mandantory
        DecimalFormat df2 = new DecimalFormat("0.00");
        double num2 = 123.3;
        double num3 = 1234.345;
        System.out.println(df2.format(num2));
        System.out.println(df2.format(num3));
        // Format with thousands of separation
        DecimalFormat df3 = new DecimalFormat("#,###.00");
        double num4 = 1234567;
        System.out.println(df3.format(num4));
        DecimalFormat df4 = new DecimalFormat("#,###");
        int num5 = 1234567;
        int num6 = 123456789;
        System.out.println(df4.format(num5));
        System.out.println(df4.format(num6));
        // Format negative number and positive number
        DecimalFormat df5 = new DecimalFormat("+#,###.00; -#,###.00");
        System.out.println(df5.format(12345.6789));
        System.out.println(df5.format(-12345.6789));
    }
}
