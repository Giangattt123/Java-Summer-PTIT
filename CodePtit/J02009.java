/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] customers = new int[N][2];
        for (int i = 0; i < N; i++) {
            customers[i][0] = sc.nextInt(); 
            customers[i][1] = sc.nextInt(); 
        }

       Arrays.sort(customers, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int currentTime = 0;
        for (int i = 0; i < N; i++) {
            int arrivalTime = customers[i][0];
            int checkInTime = customers[i][1];
            
            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }

            currentTime += checkInTime;
        }

        System.out.println(currentTime);
        
        sc.close();
    }
}
