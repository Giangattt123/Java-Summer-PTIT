/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaSummer.CodePtit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HELLOFILE {
//    private String readFromInputStream(InputStream inputStream) throws IOException {
//        StringBuilder resultStringBuilder = new StringBuilder();
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                resultStringBuilder.append(line).append("\n");
//            }
//        }
//        return resultStringBuilder.toString();
//    }
//    public void main(String[] args) {
//        String filePath = "Hello.txt"; 
//        try (InputStream inputStream = new FileInputStream(filePath)) {
//            String fileContent = readFromInputStream(inputStream);
//            System.out.println(fileContent);
//        } catch (IOException e) {
//            e.printStackTrace(); 
//        }
//    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
