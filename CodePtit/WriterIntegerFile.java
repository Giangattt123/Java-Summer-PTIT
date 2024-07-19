/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

package JavaSummer.CodePtit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriterIntegerFile {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(23);
        
        try (FileOutputStream fos = new FileOutputStream("src\\JavaSummer\\CodePtit\\SONGUYEN.in");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list);
            System.out.println("Ghi tệp thành công!");
        } catch (IOException e) {
        }
    }
}

