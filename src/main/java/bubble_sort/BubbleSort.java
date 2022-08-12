package bubble_sort;

public class BubbleSort {

    public static void sort (int[] A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <  A.length - i; j++) {
                if(A[j] < A[j-1]) {
                    int tmp  = A[j];
                    A[j] = A[j-1];
                    A[j-1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {7,4,1,5,2,4,6,3};
        sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

}
