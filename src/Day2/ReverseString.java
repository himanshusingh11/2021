package Day2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        // 1 st Method
        char[] c = s.toCharArray();
        String s1 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s1 = s1 + c[i];
        }

        System.out.println(s1);

        // 2nd Method
        String s11 = "Hello World!";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s11);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
// Can also be implemented by Collections

    }
}
