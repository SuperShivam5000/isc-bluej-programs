import java.util.*;
class p3
{
    void main(String s)
    {
        String word,s2=""; int c=0;
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            word=st.nextToken();
            if(hasVowel(word)) c++;
            else s2=s2+word+" ";
        }
        System.out.println("No. Of Words With Vowel: "+c);
        System.out.println("Remaining Sentence Without Vowel: "+s2);
    }
    boolean hasVowel(String s)
    {
        boolean st=false;
        char c;
        int i,l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
            st=true;
        }
        return st;
    }
}