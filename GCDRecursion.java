class GCDRecursion
{
    int gcd(int a, int b)
    {
        if (a%b==0)
        return b;
        return gcd(b,a%b);
    }
    void main(int a,int b)
    {
        System.out.println("GCD="+gcd(a,b));
    }
}