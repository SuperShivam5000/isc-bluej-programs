import java.io.*;
import java.util.*;
class Football
{
    Scanner s = new Scanner(System.in);
    FileInputStream fis;
    DataInputStream dis;
    FileOutputStream fos;
    DataOutputStream dos;
     void main() throws IOException
    {
        fos = new FileOutputStream("C:/Users/adity/Desktop/Binary File/football.dat",true);
        dos = new DataOutputStream(fos);
        fis = new FileInputStream("C:/Users/adity/Desktop/Binary File/football.dat");
        dis = new DataInputStream(fis);
        System.out.println("Enter 1 to search, 2 to add more records, 3 for records, 4 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1: search();break;
            case 2: add();break;
            case 3: record();break;
            case 4: System.exit(0);
            default:System.out.println("Wrong Choice");
        }
    }
    void search() throws IOException
    {
        int n; boolean found,eof; String st;
        System.out.println("Enter 1 for searching by name, 2 searching by country and 3 to search by goals scored");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter Name");
            st = s.next();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    String name = dis.readUTF();
                    String country = dis.readUTF();
                    int goals = dis.readInt();
                    if(st.equalsIgnoreCase(name))
                    {
                    found=true;
                    System.out.println(name);
                    System.out.println(country);
                    System.out.println("Goals: "+goals);
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(!found)
            System.out.println("Not Found");
            break;
            case 2:
            System.out.println("Enter Country");
            st = s.next();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    String name = dis.readUTF();
                    String country = dis.readUTF();
                    int goals = dis.readInt();
                    if(st.equalsIgnoreCase(country))
                    {
                    found=true;
                    System.out.println(name);
                    System.out.println(country);
                    System.out.println("Goals: "+goals);
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(!found)
            System.out.println("Not Found");
            break;
            case 3:
            System.out.println("Enter Goals Scored");
            n = s.nextInt();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    String name = dis.readUTF();
                    String country = dis.readUTF();
                    int goals = dis.readInt();
                    if(n==goals)
                    {
                    found=true;
                    System.out.println(name);
                    System.out.println(country);
                    System.out.println("Goals: "+goals);
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }    
            if(!found)
            System.out.println("Not Found");
            break;
            default: System.out.println("Wrong Choice");
        }
        main();
    }
    void add() throws IOException
    {
        System.out.println("Enter Name");
        String st = s.next();
        boolean found=false;
        boolean eof=false;
        while(!eof)
        {
            try
            {
                String name = dis.readUTF();
                String country = dis.readUTF();
                int goals = dis.readInt();
                if(st.equalsIgnoreCase(name))
                found=true;
            }
            catch(EOFException e)
            {
                eof=true;
            }
                    
            }    
        if(found)
        {
        System.out.println("Player is already registered");
        }
        else
        {
        System.out.println("Not Found,Creating New Record");
        System.out.println("Enter Name");
        dos.writeUTF(s.next());
        System.out.println("Enter Country");
        dos.writeUTF(s.next());
        System.out.println("Enter Goals Scored");
        dos.writeInt(s.nextInt());
        }
        main();
    }
    void record() throws IOException
    {
        boolean eof=false;
            String name = dis.readUTF();
            String country = dis.readUTF();
            int goals = dis.readInt();
            int low=goals,high=0; String highestgoal="",lowestgoal=name;
        eof=false;
            while(!eof)
            {
                try
                {
                    name = dis.readUTF();
                    country = dis.readUTF();
                    goals = dis.readInt();
                    if(goals<=low)
                    {
                        low=goals;
                        lowestgoal=name;
                    }
                    if(goals>=high)
                    {
                        high=goals;
                        highestgoal=name;
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }
            System.out.println("Highest Goals Scorer is "+highestgoal+" having "+high +" goals");
            System.out.println("Lowestt Goals Scorer is "+lowestgoal+" having "+low +" goals");
            main();
    }
}