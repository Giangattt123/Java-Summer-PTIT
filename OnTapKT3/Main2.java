package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\File\\nhanvien.dat");
        Scanner sc = new Scanner(file);
        DecimalFormat df = new DecimalFormat("##.#");
        String line;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] s = line.split(";");
            String st = s[1] + "(ID#" + s[0].trim() + ")" + " worked ";
            double num = 0.0;

            for (int i = 2; i < s.length; i++) {
                num += Double.parseDouble(s[i].replace(",", "."));
            }

            double avg = num / (s.length - 2);
            st += df.format(num) + " hours (" + df.format(avg) + " hours/day)";
            System.out.println(st);
        }
        sc.close();
    }
}
