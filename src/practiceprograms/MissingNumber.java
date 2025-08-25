package practiceprograms;

public class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5}; // Array with a missing number (3 in this case)
            int n = 5; // The expected range is from 1 to n (inclusive)

            // Calculate the expected sum of numbers from 1 to n
            int expectedSum = (n * (n + 1)) / 2;

            // Calculate the actual sum of elements in the array
            int actualSum = 0;
            for (int i = 0; i < arr.length; i++) {
                actualSum += arr[i];
            }

            // The missing number is the difference between the expected and actual sum
            int missingNumber = expectedSum - actualSum;
            System.out.println("The missing number is: " + missingNumber);
        }

    }
