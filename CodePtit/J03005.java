package JavaSummer.CodePtit;

import java.util.Scanner;

public class J03005 {
    public static String solve(String s) {
        String[] arr = s.toLowerCase().trim().split("\\s+");
        int len = arr.length;
        String tmp = arr[0].toUpperCase();
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < len; i++) {
            ans.append(Character.toUpperCase(arr[i].charAt(0)))
               .append(arr[i].substring(1));
            if (i != len - 1) {
                ans.append(" ");
            }
        }
        ans.append(", ").append(tmp);
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
