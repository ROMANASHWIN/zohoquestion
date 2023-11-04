package zoho100Question;

public class snake {
    public static void main(String[] args) {
        int n=5;
        snakePattern(n);
    }
    public static void snakePattern(int n)
    {
        int oddvaue=0,evenvalue=n;
        for(int i=0;i<n;i++)
        { 
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    oddvaue++;
                    System.out.print(oddvaue+" ");
                    
                }
                 oddvaue=oddvaue+n;
            }
            
            else
            {
                 evenvalue=evenvalue*2;
                 int printeven=evenvalue;
                for(int k=0;k<n;k++)
                {
                   System.out.print(printeven+" ");
                   printeven--;
                }
            }
           
            System.out.println();
        }
    }
    
}
