/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author DucGiang
 */
public class J02026 {
    static int [] a;
    static int ok = 1;
    static void init(int n) {
        a = new int[n];
    }
    static boolean check(List<Integer> list) {
        int len = list.size();
        for (int i = 0 ; i < len - 1 ; i++) {
            if (list.get(i) > list.get(i + 1))
                return false;
        }
        return true;
    }
    
    public static void sinh() {
        int i = a.length - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] =0;
            --i;
        }
        if (i == -1) ok = 0;
        else a[i] = 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt() , k = sc.nextInt();
            int [] arr = new int [n];
            for (int i = 0 ; i < n ; i++) arr[i] = sc.nextInt();
            List<List<Integer>> lists = new ArrayList<>();
            init(n);
            ok = 1;
            while (ok != 0) {
                List<Integer> list = new ArrayList<>();
                for (int i = 0 ; i < n ; i++) 
                    if (a[i] == 1) 
                        list.add(arr[i]);
                Collections.sort(list);
                if (list.size() == k) {
                    lists.add(list);
                }
                sinh();
            }
            Collections.sort(lists, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    for (int i = 0 ; i < k ; i++) {
                        if (o1.get(i).compareTo(o2.get(i)) != 0) {
                            return o1.get(i).compareTo(o2.get(i));
                        }
                    }
                    return 0;
                }
            });
            for (List<Integer> list : lists) {
                for (int tmp : list) {
                    System.out.print(tmp + " ");
                }
                System.out.println();
            }
        }
    }
}
