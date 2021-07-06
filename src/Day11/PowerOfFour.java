package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerOfFour {
    public  static boolean isPowerOfFour(int num) {

        boolean z = false;
        if(num ==1 ){
            z=true;
        }
        else if(num%4 == 0){
            for (int i = 0; i <=num ; i++) {
                int x = (int)Math.pow((int)4,(int)i);
                if(x==num){
                    z=true;
                }
            }
        }
        return z;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPowerOfFour(x));
    }
}
