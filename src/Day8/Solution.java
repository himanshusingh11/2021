package Day8;

public class Solution {
    public static void main(String[] args) {
        int[] array = {2,3,-2,4};
        int result = array[0];
        for (int i =0; i< array.length;i++){
            int x = array[i];

            for(int j = i+1; j<array.length;j++){
                result = Math.max(result,x);

                x*=array[j];

            }
            result = Math.max(result,x);
        }
       System.out.println(result);
    }
}
