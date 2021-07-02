package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class Shift_Zeroes_To_End {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,0,2,50,0,6};
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if(array[i]!=0){
             array[count++]= array[i];
            }


        }
        while(count< array.length) {
            array[count++] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
