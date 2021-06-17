package Day8;
//https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        int [] arr = {3,2,3,1,2,4,5,5,6};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        //k=2
        java.util.Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);

    }

}
