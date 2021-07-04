package Day10;

public class Matrix_Add {
    // add two matrice program
    public static void main(String[] args) {
        int a [][] ={{1,3,4},{2,4,3},{3,4,5}};
        int b [][] = {{1,3,4},{2,4,3},{3,4,5}};
        int c [] [] = new int[3][3]; // 3 rows and 3 columns
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                c[i][j] = a[i][j]+b[i][j];  //here we can use - for subtraction
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
