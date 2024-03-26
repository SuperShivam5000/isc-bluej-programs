import java.util.*;
class Toggle
{
    String str,newstr;
    int len;
    Toggle()
    {
        str=""; newstr=""; len=0;
    }
    void readword()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        str = s.nextLine();
        len=str.length();
    }
    void toggle()
    {
        int i; char c;
        for(i=0;i<len;i++)
        {
            c=str.charAt(i);
            if(c>='A' && c<='Z') c=Character.toLowerCase(c);
            else if (c>='a' && c<='z')c=Character.toUpperCase(c);
            newstr=newstr+c;
        }
    }
    void display()
    {
        System.out.println("Original word " + str);
        System.out.println("Toggled word " + newstr);
    }
    void main()
    {
        Toggle obj = new Toggle();
        obj.readword();
        obj.toggle();
        obj.display();
    }
}