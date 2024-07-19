/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class J07029 {
    public static final int n = (int) 1e6;
    public static int [] prime = new int[n + 1];
    public static void sangNguyenTo() {
        Arrays.fill(prime, 1);
        prime[0] = prime[1] = 0;
        for (int i = 2 ; i <= (int) 1e3 ; i++) {
            if (prime[i] == 1) {
                for (int j = i * i ; j <= n ; j += i) 
                    prime[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sangNguyenTo();
        FileInputStream fis = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] dd = new int[n + 1];
        for (Integer i : list) {
            dd[i] += prime[i];
        }
        int dem = 0;
        for (int i = n; i >= 2; i--) {
            if (dd[i] > 0) {
                System.out.println(i + " " + dd[i]);
                dem++;
                if (dem == 10) {
                    break;
                }
            }
        }
    }
}
