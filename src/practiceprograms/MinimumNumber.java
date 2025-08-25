package practiceprograms;

public class MinimumNumber {
    public static void main(String[] args) {
        int a[] = {4, 10, 23, 45, 67, 2, 3, 5, 7, 8};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min number is " + min);
    }
}
