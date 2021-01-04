package Day2;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 4, 5};
        int m = a.length;
        int n = b.length;
        //Co
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                System.out.print(a[i++] + " ");
            } else if (b[j] < a[i]) {
                System.out.print(b[j++] + " ");
            } else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }

        while (i < m) {
            System.out.print(a[i++] + " ");

        }
        while (j < n) {
            System.out.print(b[j++] + " ");
        }
        //Code For Intersection
        System.out.println(" ");
        System.out.println("Intersection Is ");
        int i1 = 0, j1 = 0;
        while (i1 < m && j1 < n) {
            if (a[i1] < b[j1]) {
               i1++;
            } else if (b[j1] < a[i1]) {
                j1++;
            } else {
                System.out.print(b[j1++] + " ");
                i1++;
            }
        }
    }
}
