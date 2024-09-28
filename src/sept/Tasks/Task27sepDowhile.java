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
