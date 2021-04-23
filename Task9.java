import java.util.Scanner;
public class Task9
{
  public static int[]square(int[]a)
  {
    int[]b=new int[a.length];

    for(int i=0; i<b.length; i++)
    {
    b[i]=a[i]*a[i];
    }
    return b;
  }
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    for(int i=0; i<a.length; i++)
    {
      a[i]=sc.nextInt();
      System.out.print(a[i] + " ");
    }
    System.out.println();
    int[]c=square(a);
    for(int i=0; i<c.length; i++)
    {
      System.out.print(c[i] + " ");
    }
    
  }
}