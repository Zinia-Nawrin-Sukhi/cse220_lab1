public class QuadEqn
{
  int a,b,c;
  public QuadEqn(int a, int b, int c)
  {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public String toString()
  {
    if(a==1)
    {
   return ("x2"+b+"x"+"+"+c);
    }
    return (a+"x2"+b+"x"+"+"+c);
  }
  public int getRoot()
  {
    int x= (int) ((-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
    return x;
  }
}