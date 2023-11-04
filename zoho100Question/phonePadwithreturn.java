package zoho100Question;
import java.io.*;
import java.util.*;
public class phonePadwithreturn {
    public static void main(String[] args) {
        String p="";
        String up="12";
        ArrayList<String>list =phoneNumber(p,up);
        System.out.println(list);
    }
    static public ArrayList<String> phoneNumber(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<(digit*3);i++)
        {
            char ch=(char)('a'+i);
            ans.addAll(phoneNumber(p+ch,up.substring(1))); 
        }
        return ans;
    }
    
}
