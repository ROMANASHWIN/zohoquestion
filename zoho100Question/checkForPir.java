package zoho100Question;

public class checkForPir {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int sum=5;
        checkpair(arr,sum);
    }
    public static void checkpair(int[] arr,int sum)
    {
        int i=0,j=arr.length-1,count=0;
        while(i<j)
        {
            if(arr[i]+arr[j]>sum)
            {
                j--;
            }
            if(arr[i]+arr[j]<sum)
            {
                i++;
            }
            if((arr[i]+arr[j])==sum)
            {
                count++;
                i++;
                j--;
                //System.out.print(count);
            }
        }
        System.out.print(count);
    }
    
}
