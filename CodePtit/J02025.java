/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02025 {
    public static int n, ok = 1;
    public static int[] bin;

    public static void init(int n) {
        bin = new int[n];
        for (int i = 0; i < n; i++) bin[i] = 0;
    }

    public static void sinh() {
        int i = n - 1;
        while (i >= 0 && bin[i] == 1) {
            bin[i] = 0;
            --i;
        }
        if (i == -1) ok = 0;
        else bin[i] = 1;
    }
    
    public static boolean check(int Sum) {
        if (Sum < 2) return false;
        for (int i = 2 ; i <= Math.sqrt(Sum) ; i++) {
            if (Sum % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            init(n);
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a , Collections.reverseOrder());
            List<List<Integer>> lists = new ArrayList<>();
            ok = 1;
            while (ok == 1) {
                List<Integer> list = new ArrayList<>();
                int Sum = 0;
                for (int i = 0; i < n; i++) {
                    if (bin[i] == 1) {
                        list.add(a[i]);
                        Sum += a[i];
                    }
                }
                if (check(Sum)) lists.add(list);
                sinh();
            }
            Collections.sort(lists, (x, y) -> {
                for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                    if (!x.get(i).equals(y.get(i))) {
                       if (x.get(i) < y.get(i)) return -1;
                       else return 1;
                    } 
                }
                return x.size() - y.size();
            });
            
            for (List<Integer> list : lists) {
                for (int x : list) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
