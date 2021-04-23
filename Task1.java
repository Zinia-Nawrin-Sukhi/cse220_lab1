import java.util.Scanner;
public class Task1{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
   int x= sc.nextInt();
   int a[]= new int [x];
   for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
     }
   if(a[0]==6 || a[a.length-1]==6){
     System.out.println("true");
   } else{
    System.out.println("false"); 
   }
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
}
  