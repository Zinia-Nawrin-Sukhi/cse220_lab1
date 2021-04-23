import java.util.Scanner; 
public class Task11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Please enter a number");
     int x=sc.nextInt();
    int a[]=new int[x];
    for(int index=0; index<a.length; index++){
   System.out.println("Please enter a number");
    a[index]=sc.nextInt();
    }
    public  boolean allDigitsOdd (){
      for(int i=0;i<a.length;i++){
        if(a[i]%2!=0){ 
        return true;
        }
        else{
        return false;
      }
      }
     System.out.println(boolean); 
      
      
    }
  }
}