import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}
