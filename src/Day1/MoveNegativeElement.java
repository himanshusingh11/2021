package Day1;

import java.util.Arrays;

public class MoveNegativeElement {
    public static void main(String[] args) {
        int arr[] = {-1, -3, -5, -6, 0, 1, 4, 8, 19, 20, 12, 34, 65, 75, 32, 23, 543, 21};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

