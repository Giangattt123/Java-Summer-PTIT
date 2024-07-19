/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.text.ParseException;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        int [] a = new int[] {1 , 2, 3};
        Arrays.sort(a);
        System.out.println(a);
        for (int x : a) {
            System.out.print(x + " ");
        }
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();
        System.out.println(Arrays.toString(a)); 
        String result = Arrays.stream(a)
                              .mapToObj(String::valueOf)
                              .collect(Collectors.joining(" "));
        System.out.println(result);
        Arrays.stream(a).mapToObj(x -> x + " ").forEach(System.out::print);
        
        System.out.println();
        // C1 : use SimpleDateFormat
        String stringIn = "5/2/2024";
        String stringOut = "10/2/2024";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateIn = sdf.parse(stringIn);
            Date dateOut = sdf.parse(stringOut);
            System.out.println(dateIn + " " + dateOut);
            long in = dateIn.getTime();
            long out = dateOut.getTime();
            System.out.println(in + " " + out);
            int days = (int) ((out - in) / (1000 * 60 * 60 * 24)) + 1;
            String dateInFormat = sdf.format(dateIn);
            String dateOutFormat = sdf.format(dateOut);
            System.out.println("Date in: " + dateInFormat + ", Date out: " + dateOutFormat + ", days: " + days);
        }catch(ParseException p) {
            System.out.println(p.getMessage());
        }
        // c2: use LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate dateIn = LocalDate.parse(stringIn, formatter);
        LocalDate dateOut = LocalDate.parse(stringOut, formatter);
        System.out.println(dateIn + " " + dateOut);
        long daysBetween = ChronoUnit.DAYS.between(dateIn, dateOut) + 1;
        System.out.println(daysBetween);
    }
}
