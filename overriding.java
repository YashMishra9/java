class Shape{
    void Area(){
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    
    @Override
    void Area(){
        System.out.println("Area of Rectangle "+ l*b);
    }
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    
    @Override
    void Area(){
        System.out.println("Area of circle "+ (3.14*r*r));
    }
}

public class overriding {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Shape s;
		s=new Circle(10);
		s.Area();
		
		s=new Rectangle(5,6);
		s.Area();

	}
}
