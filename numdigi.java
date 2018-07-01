import java.util.*;
class numdigi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Math.abs(sc.nextInt());
        int count=0;
        if(n==0)
        {
            count=1;
        }
        else
        {
        while(n>0)
        {
            int t=n%10;
            count++;
            n=n/10;
        }
        }
        System.out.println(count);
    }
}
