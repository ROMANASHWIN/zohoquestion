package zoho100Question;
import java.io.*;
import java.util.*;
class skiped{
    public static void main(String[] args) {
         int number_of_process=5;
         int start_position=0;
         int skip=2;
         ArrayList<Integer>list =new ArrayList<>();
         for(int i=1;i<=number_of_process;i++)
         {
            list.add(i);
         }
        int result= magic(list,skip,start_position);
        System.out.println(result);
    }
    public static int  magic (ArrayList<Integer> list,int skip,int index )
    {
          if(list.size()==1)
          {
            return list.get(0);
          }
            index=((index+skip)%list.size());
          list.remove(index);
          int result=magic(list,skip,index);
          return result;
    }
}