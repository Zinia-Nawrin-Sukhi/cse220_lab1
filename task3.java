import java.util.Scanner;
public class task3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int[]a=new int[5];
    int max=0;
    int location=0;
    for(int i=0; i<a.length; i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0; i<a.length; i++)
    {
      max=a[i];
      location=i;
      for(int j=i+1; j<a.length; j++)
      {
        if(a[j]>max)
        {
          max=a[j];
          location=j;
        }
      }
      int temp=a[i];
      a[i]=a[location];
      a[location]=temp;
    }
    for(int i=0; i<a.length; i++)
    {
      System.out.print(a[i]+" ,");
      }
    for(int i=0; i<a.length;i++)
    {
     if(a[i]%2==0)
      {
      System.out.print(a[i] +" ,");
      }
     if(a.length==5)
       {
       System.out.print(a[i] +" .");
       }
    }
    }
  }
  
