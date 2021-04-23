import java.util.Scanner;
public class T3P2{
  public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
     int x,n=sc.nextInt();
     try{
       
        int a[]=new int[n];
        a[5]=99;
        x=n/0;
     }
    
     catch(ArrayIndexOutOfBoundsException e){
    
     if(n<6){
        
        System.out.println("exception:  "+e);
     } 
     }
      catch(ArithmeticException e){
       
         System.out.println("exception:  "+e);  
        }
   
 
     finally{  
      System.out.println("THE END"); 
     }
  }
       
     }
     
 