package zoho100Question;

public class subSeqArray {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        rearrange(p,up);
    }
    public static void rearrange(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        rearrange(p+ch,up.substring(1));
        rearrange(p, up.substring(1));
    }
}
