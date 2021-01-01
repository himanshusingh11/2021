package Day1;

import java.util.Arrays;

public class ZeroOnesTwosSorting {
    public static void main(String[] args) {
        int[] array = {0,1,0,1,2,2,2};
        int x=0,y=0,z =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                x++;

            }
            if (array[i] == 1) {
                y++;
            }
            if (array[i] == 2) {
                z++;
            }
            if (x <= array.length - (y + z)) {
                array[i] = 0;
            }
            if (y <= array.length - (x + z)) {
                array[i] = 1;
            }
        }
            for (int i = 0; i < x; i++)
                array[i] = 0;


            for (int i = x; i < (x+y); i++)
                array[i] = 1;

            for (int i = (x+y); i < array.length; i++)
                array[i] = 2;


        System.out.println(x+" "+y+" "+z);
        System.out.println(Arrays.toString(array));
    }

}
