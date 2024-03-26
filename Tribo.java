import java.util.*;
class Tribo
{
    int start, end;
    Tribo()
    {
        start=0;
        end=0;
    }
    void read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Start Number");
        start = s.nextInt();
        System.out.println("Enter End Number");
        end = s.nextInt();
    }
    int tribo(int n)
    {
        if (n==1)
        return 0;
        if (n==2)
        return 1;
        if (n==3)
        return 1;
        else 
        return tribo(n-1) + tribo(n-2) + tribo(n-3);
    }
    void display()
    {
        int i;
        for(i=start;i<=end;i++)
        {
            System.out.println(tribo(i));
        }
    }
    void main()
    {
        Tribo obj = new Tribo();
        obj.read();
        obj.display();
    }
}