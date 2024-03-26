class Sentence
{
    String a;
    Sentence()
    {
        a="";
    }
    void readsent(String b)
    {
        a=b;
    }
    int freVowels(String b)
    {
        int i,l=b.length(),c=0;char ch;
        b=b.toUpperCase();
        for(i=0;i<l;i++)
        {
            ch=b.charAt(i);
            if(ch=='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
            c++;
        }
        return c;
    }
    void display()
    {
        int wf=0,v,i=0,l=a.length();String w = "";char c;
        for(i=0;i<l;i++)
        {
            c=a.charAt(i);
            if (c==' ') wf=wf+1;
            //here?
        }
        System.out.println("Word Frequency"+wf);
        a=a+" ";
        l = a.length () ;
        for(i=0;i<l;i++)
        {
            if( a.charAt(i)!=' ' )
            {
                w=w+a.charAt(i);
            }
            else
            {
                v=freVowels(w);
                System.out.println(w+" "+v);
                w="";
            }
        }
    }
        void main(String b)
        {
            Sentence x=new Sentence();
            x.readsent(b);
            x.display();
        }
}