package Day7;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int num = 0;

        for(int i=0; i<32; i++){
            if((n & 1) == 1) num++;
            n = n>>1;
        }

        System.out.println(num);
    }
}
