# Reverse-number
import java.io.*;
import java.util.*;
public class Reverse number
{
public static void main(String args[])throws IOException
{
int n,temp=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
n=Integer.parseInt(br.readLine());
while(n!=0)
{
temp=temp%10;
temp=temp+n%10;
n=n/10;
}
System.out.println("Reverse number is : "+temp);
}
}
