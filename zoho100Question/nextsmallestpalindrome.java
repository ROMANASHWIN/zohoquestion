package zoho100Question;

public class nextsmallestpalindrome {
    public static void main(String[] args) {
        int n=999;
        palindrome(n);
    }
    public static void palindrome(int number)
    {
        int n=number+1;
        while(true)
        {
            int result=checkpalindrome(n);
            if(result==n)
            {
                System.out.print("The next palindrome "+ result);
                break;
            }
            n++;
        }
    } 
    public static int checkpalindrome(int n)
    {
        int i=0,total=0;
        while(n>0)
        {
            int remainder=n%10;
             total=total*i+remainder;
            i=10;
            n=n/10;
        }
        return total;
    }   
}

