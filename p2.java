class p2
{
    void main(int n)
    {
        if(n<=999)
        {
            System.out.println("Invalid output");
            System.exit(0);
        }
        int i,r1,r2,r3,d1,d2;
        boolean aminno=true;
        for(i=n;i>100;i/=10)
        {
            r1=i%10;
            r2=(i/10)%10;
            r3=(i/100)%10;
            d1=Math.abs(r1-r2);
            d2=Math.abs(r2-r3);
            if(d2>d1)
            aminno=false;
        }
        if(aminno)
        System.out.println("Aminno No.");
        else
        System.out.println("Not Aminno No.");
    }
}