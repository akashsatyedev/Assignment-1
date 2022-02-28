package BasicDSAssignment;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        int[] arr = {5, 30, 67, 643, 748, 149, 41, 62, 94, 18, 67, 15, 39, 78, 14};
        Sorting.applySort(arr);
    }
    static void checkNumber(int[] arr, int number){
        int i = 0;
        while(i < arr.length){
            if(arr[i] == number){
                System.out.println(number + " found at position "+ (i+1));
                break;
            }
            i++;
        }

    }
}
