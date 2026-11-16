import java.util.Scanner;
public class palindrome {
    static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    static boolean Armstrong(int n){
        int temp=n;
        int sum=0;
        int x=String.valueOf(n).length();
        while(n!=0){
            int digit=n%10;
            sum+=Math.pow(digit,x);
            n/=10;
        }
        return sum==temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string ");
        String s=sc.next();

        if(isPalindrome(s)){
            System.err.println("String is Palindrome");
        }

        System.out.println("Enter your number ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(Armstrong(i)){
                System.out.println(i+" is Armstrong number");
            }
        }

    }
}
