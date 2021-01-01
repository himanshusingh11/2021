package Day1;
public class MaximumAndMinimum {
    public static void main(String[] args) {
        int [] array = {10,54,55,34,6,99,103,1453,2};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max= array[i];
            }
            if(min>array[i]){
                min= array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
