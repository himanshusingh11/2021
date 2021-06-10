package Day6;

import java.util.Scanner;

public class FactorialLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int fact = 1;
        for (int i = 1 ; i<=x ;i++){
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
