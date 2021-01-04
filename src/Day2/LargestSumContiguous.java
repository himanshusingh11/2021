package Day2;


import java.util.Scanner;


public class LargestSumContiguous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]= scanner.nextInt();
        }
        // Kadane's Algorithm
        // O(n) Time Complexity
        int sum = 0;
        int max =array[0];
        for (int j : array) {
            sum = sum + j;
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(max);
// Normal solution
        /*for (int i = 0; i < array.length; i++) {
            int x = array[i];
            for (int j = i+1; j < array.length; j++) {
                int sum = x+array[j];
                if (max<sum) {
                    max = sum;
                }
            }
        }
        System.out.println(max);*/
    }
}
