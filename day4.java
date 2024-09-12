mport java.util.Arrays;

public class day4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0}; 
        int[] arr2 = {2, 4, 6, 8};
        int m = 4; 
        int n = 4; 
        
        
        merge(arr1, m, arr2, n);
        
        
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; 
        int j = n - 1;
        int k = m + n - 1; 

       
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
}
