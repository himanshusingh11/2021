package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Unknown {
    public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int tenths = 0;
            int ones = 0;
            if(num % 10 != 0){
                tenths = num - (num % 10);
                ones = num % 10;
            }
            else {
                ones = num;
            }
            int[] tenS = new int[5];
            int[] oneS = new int[5];
            if(ones <= 5){
                while (ones > 0){
                    oneS[ones-1] = 1;
                    ones--;
                }
            }
            else {
                oneS[0] = 1;

            }
        System.out.println(Arrays.toString(tenS));

        System.out.println(Arrays.toString(oneS));
           /* int j =0;
                    int k = 0;
            int[] finalarray = new int[10];
        for (int i = 0; i < finalarray.length ; i++) {
           if(i<=5)
            finalarray[i]=tenS[i];
           else{
               finalarray[i]= oneS[finalarray.length-1];
           }
        }
       System.out.println(Arrays.toString(finalarray));*/

        }
    }




