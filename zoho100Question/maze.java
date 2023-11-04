package zoho100Question;

public class maze {
    public static void main(String[] args) {
        int r=3;
        int c=3;    
    }
    public static int mazeFun(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }
        int left=mazeFun(r-1, c);
        int right=mazeFun(r, c-1);
        return left+right; 
    }
}
