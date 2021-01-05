package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicatesInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        char[] c = s.toCharArray();

        System.out.println(Arrays.toString(c));
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j] && c[i] != ' ') {
                    count++;
                    c[j] = '0';
                }
            }
            if (count > 1 && c[i] != '0') {
                System.out.println(c[i] + " " + count);
            }

        }


    }
}
