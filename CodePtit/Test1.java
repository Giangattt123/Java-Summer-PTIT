/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
       String s = "6/1/2024";
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date date = sdf.parse(s);
       long ms =  date.getTime();
       long days = ms / (1000 * 60 * 60 * 24);
       System.out.println(date + " " + ms + " " + days);
    }
}
