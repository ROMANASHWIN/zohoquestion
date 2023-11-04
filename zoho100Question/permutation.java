package zoho100Question;
import java.io.*;
import java.util.*;
public class permutation {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        ArrayList<String> list=permutationRecursion(p,up);
        System.out.println(list);
    }
    public static ArrayList<String> permutationRecursion(String p,String up)
    {
        if(up.isEmpty())
        {
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationRecursion(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
