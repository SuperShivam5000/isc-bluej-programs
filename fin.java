class fin
{
    void main()
    {
        int i;double amount=10000000, amount2 = amount;
        for(i=2;i<=12;i++)
        {
            amount=amount*1.20;
            amount=amount+10000000;
            System.out.println("Amount in year " + i + " = " + amount);
            //amount2=amount2*1.30;
            //amount2=amount2+20000000;
            //System.out.println("Amount2 in year " + i + " = " + amount2);
        }
    }
}