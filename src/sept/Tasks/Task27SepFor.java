package sept.Tasks;

public class Task27SepFor {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop
        int s = 0;
        int i = 1;
        while (i <= 100) {
            s = s + i;
            i++;
        } System.out.println("Sum: " + s);
    }
}
