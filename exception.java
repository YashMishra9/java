import java.util.Scanner;

public class exception{
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        try{
            System.out.println("Division " + a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        }
        
        int arr[]={3,4,5,6,7};
        System.out.println("Enter array index");
        int idx=sc.nextInt();
        
        try{
            System.out.println("Element at index"+ arr[idx]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound!!" );
        }
        
        
        
        
        

	}
}