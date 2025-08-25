package practiceprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int b;

        System.out.println("Take a Number = 36");
        System.out.println("Reverse of the number is :" );
                for(int a=36;a>0;a=a/10){
                    b=a%10;
                    System.out.println(b);
            }

        }
    }

