package Day2;


import java.util.Scanner;

public class StringPalindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] c = s.toCharArray();
        String s1 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s1 = s1 + c[i];
        }
        /*char[] d = s1.toCharArray();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));*/
        if (s.equals(s1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }


}

