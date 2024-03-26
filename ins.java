class ins
{
    void main(int a[],int x[],int p)
    {
        int z[]= new int[15];
        int i,c=0;
        for(i=0;i<p;i++)
        {
            z[c]=a[i];
            c++;
        }
        for(i=0;i<4;i++)
        {
            z[c]=x[i];
            c++;
        }
        for(i=p;i<11;i++)
        {
            z[c]=a[i];
            c++;
        }
        for(i=0;i<15;i++)
        {
            System.out.println(z[i]);
        }
    }
}