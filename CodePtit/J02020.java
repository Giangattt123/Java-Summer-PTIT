/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02020 {
    public static int ok = 1;
    public static int cnt = 1;
    public static void sinhToHop(int[] a, int n, int k){
        int i = k ;
        while(i > 0 && a[i] == n - k + i) i--;
        if(i == 0) ok = 0;
        else{
            cnt++;
            a[i]++;
            for(int j = i + 1 ; j <= k ; j++){
                a[j] = a[j - 1] + 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k + 1];
        for(int i = 1 ; i <= k ; i++){
            a[i] = i;
        }
        while(ok == 1){
            for(int i = 1 ; i <= k ; i++){
                System.out.print(a[i] + " ");
            }
            sinhToHop(a, n, k);  
            System.out.println();
        }
        System.out.printf("Tong cong co %d to hop\n", cnt);
    }
}
