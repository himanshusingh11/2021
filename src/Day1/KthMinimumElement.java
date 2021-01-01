package Day1;


import java.util.Arrays;

public class KthMinimumElement {
    public static void main(String[] args) {

        int k = 2;
        int[] array = {7, 10, 4, 3 ,20 ,15};
        java.util.Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Kth Minimum Element");
        System.out.println(array[k-1]);
        System.out.println("Kth Maximum Element");
        System.out.println(array[(array.length-1)-k+1]);

        }
    }


