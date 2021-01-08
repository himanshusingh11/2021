package Day4;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Arrays are sorted
        int[] array1 = {1,2,3,3,4,6,6};
        int[] array2 =  {2,5,8,9,10,11};
        int[] finalArray = new int[array1.length+ array2.length];
        for (int i = 0; i < array1.length; i++) {
            finalArray[i]= array1[i];

        }
        for (int i = 0; i < array2.length ; i++) {

                finalArray[i+ array1.length]=array2[i];
        }

        Arrays.sort(finalArray);

    }
}
