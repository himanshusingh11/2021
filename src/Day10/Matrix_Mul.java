package Day10;


import java.util.Scanner;

public class Matrix_Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // first matrix input
        int r1= scanner.nextInt();
        int c1 = scanner.nextInt();
        int one [][] = new int[r1][c1];
        for (int i = 0; i <one.length ; i++) {
            for (int j = 0; j <one[0].length ; j++) {
                one[i][j] = scanner.nextInt();
            }

        }



// Second matrix input
        int r2= scanner.nextInt();
        int c2 = scanner.nextInt();
        int two [][] = new int[r2][c2];
        for (int i = 0; i <two.length ; i++) {
            for (int j = 0; j < two[0].length ; j++) {
                two[i][j] = scanner.nextInt();
            }

        }

// Check condition for matrix multiplication
        if(c1!=r2){
            System.out.println("Not valid ");
        }
        // Take product matrix
        int product[][] = new int[r1][c2];
        for (int i = 0; i <product.length ; i++) {
            for (int j = 0; j < product[0].length ; j++) {
                for (int k = 0; k < c1 ; k++) {
                    product[i][j] +=one[i][k] * two[k][j];
                }
            }
        }


        /*
        Print first matrix , second matrix and product  matrix
         */

        for (int i = 0; i <one.length ; i++) {
            for (int j = 0; j < one[0].length ; j++) {
                System.out.print(one[i][j]+" ");
            }
            System.out.println();

        }


        System.out.println();

        for (int i = 0; i < two.length ; i++) {
            for (int j = 0; j < two[0].length; j++) {
                System.out.print(two[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println();
        for (int i = 0; i <product.length ; i++) {
            for (int j = 0; j < product[0].length ; j++) {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

        }
    }

