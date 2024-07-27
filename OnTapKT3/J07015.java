/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class J07015 {
    public static int[] prime = new int[10000];
    public static void sangNguyenTo() {
        Arrays.fill(prime , 1);
        prime[0] = prime[1] = 0;
        for (int i = 2 ; i <= 100 ; i++) {
            if (prime[i] == 1) {
                for (int j = i * i ; j < 10000 ; j+=i) {
                    prime[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sangNguyenTo();
       FileInputStream fis = new FileInputStream("SONGUYEN.in");
     //   FileInputStream fis = new FileInputStream("src\\JavaSummer\\CodePtit\\SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Integer> list = (List<Integer>) ois.readObject();
        ois.close();
        // System.out.println(list);
        int [] cnt = new int[10000];
        for (Integer x : list) {
            cnt[x] += prime[x];
        }
        for (int i = 2; i < 10000; i++) {
            if (cnt[i] > 0) {
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}


