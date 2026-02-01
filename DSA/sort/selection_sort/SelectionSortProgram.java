package DSA.sort.selection_sort;

import java.util.Arrays;

public class SelectionSortProgram {
    public static void main(String[] args) {
        int arr[] = {6,1,3,13,4,7,5,2};
        int n = arr.length;
        int minIndex;
        int swap;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                swap = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = swap;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

