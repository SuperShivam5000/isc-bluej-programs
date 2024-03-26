import java.util.*;
class Series
{
    int X,N;
    double sum;
    Series()
    {
        X=0;N=0;sum=0;
    }
    void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no.");
        X=s.nextInt();
        System.out.println("Enter no. of terms");
        N=s.nextInt();
    }
    int sum(int a)
    {
        if(a==1) return a;
        else return a+sum(a-1);
    }
    void display()
    {
        int i;
        for(i=1;i<=N;i++)
        {
            sum=sum+(double)X*i/sum(i);
        }
        System.out.println("Sum = "+sum);
    }
    void main()
    {
        Series obj = new Series();
        obj.accept();
        obj.display();
    }
}