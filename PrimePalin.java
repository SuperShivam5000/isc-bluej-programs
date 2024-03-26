class PrimePalin
{
    int S;
    int E;
    PrimePalin(int X,int Y)
    {
        S=X;
        E=Y;
    }
    int isPrime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if (c==2) return 1; else return 0;
    }
    int isPalindrome(int n)
    {
        int rev=0,t,o=n;
        for( ;n!=0;n/=10)
        {
            t=n%10;
            rev=rev*10+t;
        }
        if(rev==o) return 1; else return 0;
    }
    void generate()
    {int i;
        for(i=S;i<=E;i++)
        {
            if(isPrime(i)==1 && isPalindrome(i)==1)
            System.out.println(i);
        }
    }
    void main(int X, int Y)
    {
        PrimePalin obj = new PrimePalin(X,Y);
        obj.generate();
    }
}