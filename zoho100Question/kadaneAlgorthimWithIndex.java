package zoho100Question;

public class kadaneAlgorthimWithIndex {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(arr);
    }
    public static void kadaneAlgo(int[] arr)
    {
        int max_far=-2345,max_cur=0,start=0,end=0,i=0,s=0;
        for( i=0;i<arr.length;i++)
        {
            max_cur=max_cur+arr[i]; 
            if(max_far<max_cur)
            {
                max_far=max_cur;
                start=s;
                end=i;
            }
                
            if(max_cur<0)
            {
                max_cur=0;
                s=i+1;
            }
        }
        System.out.println(start+" "+ end+" "+max_far);
    } 
}
