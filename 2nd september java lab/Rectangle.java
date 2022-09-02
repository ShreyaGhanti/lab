public class Rectangle 
{ 
   private int length; 
   private int breadth; 

 Rectangle(int l, int b)
 { 
  length = l; 
  breadth = b; 
  }
 void calculateArea() {
int area=length*breadth;
System.out.println("the area is" +area);
 }
 class RectangleTest 
	{ 
	public static void main(String[] args)
	{ 
	   Rectangle rec=new Rectangle(40,40);
	   Rectangle rec1=new Rectangle(50,50);
	   rec.calculateArea();
	   rec1.calculateArea();
	}
	}}
	   