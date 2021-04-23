public class Test13{
  public static int [] removeOdd (int [] input){
     int[]c=new int[input.length];
 for(int i=0; i<input.length; i++)
 {
  if(input[i]%2==0)
  {
  //System.out.println(input[i]);
 
 if(c[i]==0 )
 {
 c[i]=input[i];
 }
 else
 {
 if(c[i+1]!=0)
 {
 c[i]=input[i];
 }
 }
  }
 }
 return c ;   
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}
