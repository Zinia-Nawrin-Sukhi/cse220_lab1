import java.util.Scanner;
public class task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[15];
    int n;
    for( int i=0; i<15;++i)
    {
      n=sc.nextInt();
      a[n]=a[n]+1;
    }
    for(int i=0; i<=9; i++)
    {
      System.out.println(i+ " was found "+a[i]+ " times ");
    }
  }
}