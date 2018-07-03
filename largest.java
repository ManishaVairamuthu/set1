import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n>n1)
        {
            if(n>n2)
            System.out.print(n);
            else
            System.out.print(n2);
        }
        else
        {
            if(n1>n2)
            System.out.print(n1);
            else
            System.out.print(n2);
        }
    }
}
