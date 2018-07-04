import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==1||n==0)
         count=0;
         else
         {
        for(int i=2;i<n;i++)
        {
            if(n%i!=0)
            count++;
        }
        }
        if(count==n-2||n==2)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
