import java.util.Scanner;
class evenorodd
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=1 && n<=100000)
{
System.out.print("Positive");
}
else if(n==0)
{
System.out.print("Zero");
}
else
{
System.out.print("Negative");
}
}
}
