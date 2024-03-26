import java.io.*;
import java.util.*;
class DepartmentalStore
{
    Scanner s = new Scanner(System.in);
    FileInputStream fis;
    DataInputStream dis;
    FileOutputStream fos;
    DataOutputStream dos;
    FileInputStream fis2;
    DataInputStream dis2;
    FileOutputStream fos2;
    DataOutputStream dos2;
    void main() throws IOException
    {
        fos = new FileOutputStream("C:/Users/adity/Desktop/Binary File/store.dat",true);
        dos = new DataOutputStream(fos);
        fis = new FileInputStream("C:/Users/adity/Desktop/Binary File/store.dat");
        dis = new DataInputStream(fis);
        fos2 = new FileOutputStream("C:/Users/adity/Desktop/Binary File/trans.dat",true);
        dos2 = new DataOutputStream(fos);
        fis2 = new FileInputStream("C:/Users/adity/Desktop/Binary File/trans.dat");
        dis2 = new DataInputStream(fis);
        System.out.println("Enter 1 for enquiry, 2 for adding more records, 3 for transaction, 4 to generate report and 5 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1: enquiry(); break;
            case 2: add(); break;
            case 3: transaction(); break;
            case 4: generate(); break;
            case 5: System.exit(0);
            default: System.out.println("Wrong Choice");
        }
    }
    void enquiry() throws IOException
    {
        int n; boolean found,eof; String st;
        System.out.println("Enter 1 for searching by item number, 2 searching by item name and 3 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter Item Number");
            n = s.nextInt();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int itemnumber = dis.readInt();
                    String itemname = dis.readUTF();
                    int rate = dis.readInt();
                    int quantitystocked = dis.readInt();
                    int restockorder = dis.readInt();
                    if(n==itemnumber)
                    found=true;
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(found)
            System.out.println("Found");
            else
            System.out.println("Not Found");
            break;
            case 2:
            System.out.println("Enter Item Name");
            st = s.next();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int itemnumber = dis.readInt();
                    String itemname = dis.readUTF();
                    int rate = dis.readInt();
                    int quantitystocked = dis.readInt();
                    int restockorder = dis.readInt();
                    if(st.equalsIgnoreCase(itemname))
                    found=true;
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(found)
            System.out.println("Found");
            else
            System.out.println("Not Found");
            break;
            case 3: System.exit(0);
            default: System.out.println("Wrong Choice");
        }
        main();
    }
    void add() throws IOException
    {
        System.out.println("Enter Item Numeber");
        dos.writeInt(s.nextInt());
        System.out.println("Enter Item Name");
        dos.writeUTF(s.next());
        System.out.println("Enter Rate");
        dos.writeInt(s.nextInt());
        System.out.println("Enter Quantity Stocked");
        dos.writeInt(s.nextInt());
        System.out.println("Enter Reorder level for 10 items");
        dos.writeInt(s.nextInt());
        main();
    }
    void transaction() throws IOException
    {
            System.out.println("Enter Item Name");
            String st = s.next();
            boolean found=false;
            boolean eof=false;
            while(!eof)
            {
                try
                {
                    int itemnumber = dis.readInt();
                    String itemname = dis.readUTF();
                    int rate = dis.readInt();
                    int quantitystocked = dis.readInt();
                    int restockorder = dis.readInt();
                    if(st.equalsIgnoreCase(itemname))
                    {
                    found=true;
                    if (quantitystocked>0)
                    {
                        System.out.println("Enter Quantity");
                        int bought = s.nextInt();
                        if (bought<=quantitystocked)
                        {
                            int bill=bought*rate;
                            System.out.println("Bill: " + bill);
                            dos2.writeInt(itemnumber);
                            dos2.writeUTF(itemname);
                            dos2.writeInt(bought);
                            dos2.writeInt(rate);
                            dos2.writeInt(bill);
                            break;
                        }
                        else
                        {
                            System.out.println("Sorry, we dont have so many of this item");
                            break;
                        }
                    }
                    else
                    {
                        System.out.println("Sorry, we are out of stock on this item");
                        break;
                    }
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(!found)
            System.out.println("Not Found");
            main();
    }
    void generate() throws IOException
    {
        boolean eof;
        System.out.println("Enter 1 for daily transaction report, 2 for list by re-order level and 3 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            eof=false;
            while(!eof)
            {
                try
                {
                    System.out.println("Item Number " + dis2.readInt());
                    System.out.println("Item Name " + dis2.readUTF());
                    System.out.println("Quantity Purchased " + dis2.readInt());
                    System.out.println("Rate " + dis2.readInt());
                    System.out.println("Bill " + dis2.readInt());
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }
            break;
            case 2:
            System.out.println("Enter Rol");
            int rol = s.nextInt();
            eof=false;
            while(!eof)
            {
                try
                {
                    int itemnumber = dis.readInt();
                    String itemname = dis.readUTF();
                    int rate = dis.readInt();
                    int quantitystocked = dis.readInt();
                    int restockorder = dis.readInt();
                    if(rol>restockorder)
                    System.out.println(itemname);
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }
            break;
            case 3:System.exit(0);
            default:System.out.println("Wrong Choice");
        }
        main();
    }
}