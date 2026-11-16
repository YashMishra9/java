import java.util.Scanner;

class Area{
    double calculate(double r){
        return 3.14*r*r;
    }
    
    
    int calculate(int l,int b){
        return l*b;
    } 
    
    int calculate(int s){
        return s*s;
    }
        
}
public class method {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        
        Area obj=new Area();
        System.out.println("Enter radius ");
        double r=sc.nextDouble();
        
        System.out.println("Enter length and breadth ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("Enter side of square ");
        int s=sc.nextInt();
        
        
        System.out.println("Area of circle"+ obj.calculate(r));
        System.out.println("Area of rectangle"+ obj.calculate(l,b));
        System.out.println("Area of square"+ obj.calculate(s));
        sc.close();
	}
}
