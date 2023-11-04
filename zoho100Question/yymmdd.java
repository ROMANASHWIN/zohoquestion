package zoho100Question;
public class yymmdd 
{
    static class Date
    {
        int d,m,y;
         public Date(int d,int m,int y)
        {
            this.d=d;
            this.m=m;
            this.y=y;
        }
    };
        static int month[]={31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        static int leapyears(Date d)
        {
            int year=d.y;
            if(d.m<=2)
                year--;
            return year/4 -year/100+year/400;
        }
        static int getdifference(Date d1,Date d2)
        {
            int n1=d1.y*365+d1.d;
            for(int i=0;i<d1.m-1;i++)
            {
                n1=n1+month[i];
            }
            n1=n1+leapyears(d1);
            int n2=d2.y*365+d2.d;
            System.out.print("1");
            for(int j=0;j<d2.m-1;j++)
            {
                n2+=month[j];
            }
            n2=n2+leapyears(d1);
            return n2-n1;
        }
    public static void main(String[] args) 
    {
        Date d1=new Date(2,3,2003);
        Date d2=new Date(4,5,2013);
        int result=getdifference(d1,d2);
        System.out.println(result);
    }
    
}

