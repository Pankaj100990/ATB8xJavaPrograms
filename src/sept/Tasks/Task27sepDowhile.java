package sept.Tasks;

public class Task27sepDowhile {
 //   Create a Java program that prints the first 5 even numbers using a do-while loop
 public static void main(String[] args) {
     int a=0;
     do{
         if(a%2 ==0)
         {
             System.out.println("First 5 Even Numbers : " + a);
         }
         a++;
     }while(a<10);
 }
}
// Pramod Solution:
// Print the First 5 Even Numbers
//        int count = 1;
//        int number = 2;
//        do {
//            System.out.println(number);
//            number +=2;
//            count++;
//        }while (count <= 5);
//    }

//  Solution 2:
//int count = 0; // To keep track of how many even numbers we've printed
//int number = 2; // Start from the first even number
//
//        do {
//                if (number % 2 == 0) { // Check if the number is even
//                System.out.println(number); // Print the current even number
//                  count++; // Increment the count of even numbers printed
//        }
//           number++; // Move to the next number
//        } while (count < 5); // Continue until we've printed 5 even numbers
//        }