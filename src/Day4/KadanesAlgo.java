package Day4;

public class KadanesAlgo {
    public static void main(String[] args) {
     int[] array = { 1,2,3,-2,5};
     int size = array.length;
     int max_ending_here = array[0];
     int max_so_far = array[0];
     //Optimized fo Negative Values also
        for (int i = 1; i <size ; i++) {
            max_ending_here = Math.max(array[i],max_ending_here+array[i]);
            max_so_far = Math.max(max_so_far,max_ending_here);

        }
        System.out.println(max_so_far);
    }
}
