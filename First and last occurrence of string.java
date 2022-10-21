public class Main
{
    public static int first=-1;
    public static int last=-1;
    public static void reversestr(String str, int ind,char ele)
    {
        
        if(ind==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=str.charAt(ind);
        if(curr==ele)
        {
            if(first==-1)
            {
                first=ind;
            }
            else
            last=ind;
        }
         
        reversestr(str,ind+1,ele);
       
    }
	public static void main(String[] args) {
	    String str="abcdeaaaa";
	    
	    reversestr(str,0,'a');
	}
}
