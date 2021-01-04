package Day2;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int z = 0; z < t; z++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                int j = scanner.nextInt();
                array[i] = j;

            }
            System.out.println();
            int n1 = array.length;
            int x = array[n1 - 1];//stores the last element
            //now shift all the elements to one position right
            for (int i = n1 - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = x;

            for (int i = 0; i < array.length ; i++) {
                System.out.print(array[i]+" ");
            }



        }
    }


}

