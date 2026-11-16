import java.util.Scanner;
public class fact {
static int factorial(int n){
    int fact=1;
    for(int i=2;i<=n;i++){
        fact*=i;
    }
    return fact;
}

static int digitSum(int n){
    int sum=0;
    while(n!=0){
        int digit=n%10;
        sum+=digit;
        n/=10;
    }
    return sum;
}


static int reverse(int n){
    int rev=0;
    while (n!=0) {
        int digit=n%10;
        rev=rev*10+digit;
        n/=10;
    }
    return rev;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number ");
        int n=sc.nextInt();

        int fact=factorial(n);
        System.out.println("Factorial is: "+ fact);
        System.out.println("Sum of digits is: "+ digitSum(fact));
        System.out.println("Reverse of digits is: "+ reverse(fact));

    }
    
    
}