public class Square
{
 double h, w, a;
   public void setHeight(double h)
    {
        this.h=h;
    }
    public double getHeight()
    {
        return h;
    }
    public void setWidth (double w)
    {
       this.w=w;
    }
    public double getWidth ()
    {
        return w;
    }
    
   
public double getArea (){
  a= h*w;
  return a;
}
}