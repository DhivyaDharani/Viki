import java.util.*;
import java.io.*;
public class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,a;
int sum=0;
System.out.println("enter the value of last number");
a=sc.nextInt();
  if(a>0)
  {
for(i=0;i<a;i++)
{
sum=sum+i;
}
System.out.println("The sum is"+sum);
    else
    {
      System.out.println("The given number is not a natural number");
    }
}
}
