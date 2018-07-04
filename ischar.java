import java.util.*;
class ischar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(Character.isLetter(s.charAt(0)))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print("No");
        }
    }
}
