package sept.Tasks;

public class Task18Sep2 {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a++ + a++); //21 (10+11)
//        System.out.println(a); //12 (11,12)
//        int a = 10;
//        System.out.println(++a + ++a); //23 (11 + 12)
//        System.out.println(a); //12 (11,12)
//        int  a = 10;
//        System.out.println(a-- + a--); //19
//        System.out.println(a); //8
//        int a = 10;
//        System.out.println(--a + --a); //17
//        System.out.println(a); //8

//        int a = 10;
//        System.out.println(--a + a--+ a--); //(9+9+8=26)
//        System.out.println(a);//(9,8,7)

//        int a = 10;
//        System.out.println(--a + a++ + a--); //(9+9+10=28)
//        System.out.println(a); //(9,10,9)

        int a = 10;
        System.out.println(a--+ a-- + a--); //(10+9+8=27)
        System.out.println(a); //(9,8,7)
    }
}
