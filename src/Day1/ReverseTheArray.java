package Day1;

import java.util.Arrays;


public class ReverseTheArray {
    public static void main(String[] args) {
        int[] array = {2,3,5};
        int[] newArray = new int[array.length];
        for (int i = array.length-1; i >=0; i--) {

            newArray[(array.length-1)-i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
