/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class Time implements Comparable<Time> {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours) {
            return this.hours - other.hours;
        }
        if (this.minutes != other.minutes) {
            return this.minutes - other.minutes;
        }
        return this.seconds - other.seconds;
    }

    @Override
    public String toString() {
        return hours + " " + minutes + " " + seconds;
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> times = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int hours = sc.nextInt();
            int minutes = sc.nextInt();
            int seconds = sc.nextInt();
            times.add(new Time(hours, minutes, seconds));
        }

        Collections.sort(times);

        for (Time time : times) {
            System.out.println(time);
        }
    }
}
