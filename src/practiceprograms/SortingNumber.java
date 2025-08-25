package practiceprograms;

public class SortingNumber {
    public static void main(String[] args) {
        int temp = 0;
        int[] arr = {4, 10, 23, 45, 67, 2, 3, 5, 7, 8};

        for (int i = 0; i < arr.length; i++) {
 //           for (int j = i; j < arr.length; j++) {
            for (int j = i+1; j < arr.length; j++) {

            if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}