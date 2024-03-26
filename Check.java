import java.util.*;
class Check
{
    String wrd;
    int len;
    Check()
    {
        wrd="";
        len=0;
    }
    void acceptword()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = s.next();
        len=wrd.length();
    }
    boolean palindrome()
    {
        int i; String s="";
        for(i=len-1;i>=0;i--)
        {
            s=s+wrd.charAt(i);
        }
        if(s.equalsIgnoreCase(wrd)) return true;
        else return false;
    }
    void display()
    {
        System.out.println("Word is "+wrd);
        if(palindrome()) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
    void main()
    {
        Check obj = new Check();
        obj.acceptword();
        obj.display();
    }
}