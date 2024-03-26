import java.util.*;
class MaxArray
{
    int Ar[][], n;
    Scanner s = new Scanner(System.in);
    public MaxArray(int m)
    {
        n=m;
        Ar = new int[n][n];
    }
    void inputarray()
    { int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter Element");
                Ar[i][j]=s.nextInt();
            }
        }
    }
    void largest()
    {
        int i,j,max=0;
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(Ar[j][i]>max)
                max=Ar[j][i];
            }
            System.out.println("Greatest in collumn" + (i+1) + "is" + max);
            max=0;
        }
    }
        void display()
        {int i,j;
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(Ar[i][j]);
            }
            System.out.println();
        }
    }
    void main(int n)
    {
        MaxArray obj=new MaxArray(n);
        obj.inputarray();
        obj.largest();
        obj.display();
    }
}