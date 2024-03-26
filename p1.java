class p1
{
    void main(int a[][])
    {
        int i,j,r=a.length,c=a[0].length,s=r*c,count=0,temp;
        int x[] = new int[s];
        System.out.println("Original Array");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                x[count]=a[i][j];
                count++;
            }
        }
    for(i=0; i < s; i++)
    {  
                 for(j=1; j < (s-i); j++)
                 {  
                          if(x[j-1] > x[j])
                          {  
                                 //swap elements  
                                 temp = x[j-1];  
                                 x[j-1] = x[j];  
                                 x[j] = temp;  
                         }  
                          
                 }  
         }
         count=0;
         for(i=0;i<r;i++)
         {
             for(j=0;j<c;j++)
             {
                 a[j][i]=x[count];
                 count++;
                }
            }
            System.out.println("Arranged Array");
            for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}