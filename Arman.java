class Arman
{
    void decimal2binary(int n)
    {
        int x=0,c=0,r,q=n/2;
        while(q>0)
        {
            r=n%2;
            q=n/2;
            x=x+r*(int)Math.pow(10,c);
            c++;
            n=q;
        }
        System.out.println(x);
    }
    void decimal2octal(int n)
    {
        int x=0,c=0,r,q=n/8;
        while(q>0)
        {
            r=n%8;
            q=n/8;
            x=x+r*(int)Math.pow(10,c);
            c++;
            n=q;
        }
        System.out.println(x);
    }
    void decimal2hexadecimal(int n)
    {
        int c=0,r,q=n/16; String x="";
        while(q>0)
        {
            r=n%16;
            q=n/16;
            if(r<=9) x=r+x;
            else x=(char)(r+55)+x;
            c++;
            n=q;
        }
        System.out.println(x);
    }
    void binary2decimal(int n)
    {
        int r,x=0,i,c=0;
        for(i=n;i>0;i=i/10)
        {
            r=i%10;
            x=x+r*(int)Math.pow(2,c);
            c++;
        }
        System.out.println(x);
    }
}