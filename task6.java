import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("please enter array length");
  int b=sc.nextInt();
  int[]a=new int[b];
  for(int i=0; i<a.length; i++)
  {
  a[i]=sc.nextInt();
  }
  if(a[0]==a[a.length-1] && a[1]==a[a.length-2])
  {
  System.out.println("it is a palindrome");
  }
  else
  {
  System.out.println("it is not a palindrome");
  }
}
}