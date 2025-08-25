package practiceprograms;

public class MaximumNumber {

        public static void main(String[] args) {
            int a[] = {4, 10, 23, 45, 67, 2, 3, 5, 7, 8};
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println("max number is " + max);
        }
    }

