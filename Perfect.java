import java.util.*;
class Perfect
{
    int num,sum;
    Perfect()
    {
        num=0;sum=0;
    }
    void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no.");
        num=s.nextInt();
    }
    void factorSum(int a)
    {
        if(a==0) return;
        if(num%a==0) sum=sum+a;
        factorSum(a-1);
    }
    void display()
    {
        factorSum(num);
        sum=sum-num;
        if(sum==num)System.out.println("Perfect");
        else System.out.println("Not Perfect");
    }
    void main()
    {
        Perfect obj = new Perfect();
        obj.accept();
        obj.display();
    }
}