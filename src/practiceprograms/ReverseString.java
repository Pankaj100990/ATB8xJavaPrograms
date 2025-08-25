package practiceprograms;

public class ReverseString {
    public static void main(String[] args){
        String temp="";
        String str="anand vihar";
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            temp=temp+ch[i];
        }
        System.out.println(temp);
    }
}
