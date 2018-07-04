import java.util.*;
class vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(Character.isLetter(s.charAt(0)))
        {
            char s1=s.charAt(0);
            if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
                System.out.print("Vowel");
            else
                System.out.print("Consonant");
        }
        else
        {
            System.out.print("invalid");
        }
    }
}
