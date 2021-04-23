import java.util.Scanner; 
public class Task4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    for(int index=0; index<a.length; index++){
   System.out.println("Please enter a number");
    a[index]=sc.nextInt();
  for(int j=0; j<index; j++)
  {
    if(a[index]==a[j]){
      System.out.println("Please enter different number");
      index--;
      break;
    
  }
  }
}
}
}
   