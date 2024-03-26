import java.io.*;
import java.util.*;
class StudentManagement
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
        fos = new FileOutputStream("C:/Users/adity/Desktop/Binary File/student.dat",true);
        dos = new DataOutputStream(fos);
        fis = new FileInputStream("C:/Users/adity/Desktop/Binary File/student.dat");
        dis = new DataInputStream(fis);
        fos2 = new FileOutputStream("C:/Users/adity/Desktop/Binary File/temp.dat",true);
        dos2 = new DataOutputStream(fos);
        fis2 = new FileInputStream("C:/Users/adity/Desktop/Binary File/temp.dat");
        dis2 = new DataInputStream(fis);
        System.out.println("Enter 1 for enquiry, 2 for adding more records, 3 to generate list and 4 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1: enquiry(); break;
            case 2: add(); break;
            case 3: generate(); break;
            case 4: System.exit(0);
            default: System.out.println("Wrong Choice");
        }
    }
    void enquiry() throws IOException
    {
        int n; boolean found,eof; String st;
        System.out.println("Enter 1 for searching by Reg. Number, 2 for searching by roll number, 3 for searching by name, 4 for searching by mobile number and 5 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter Reg. Number");
            n = s.nextInt();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(n==regnumber)
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
            System.out.println("Enter Roll Number");
            n = s.nextInt();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(n==rollnumber)
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
            case 3:
            System.out.println("Enter Full Name");
            st = s.next();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(st.equalsIgnoreCase(name))
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
            case 4:
            System.out.println("Enter Mobile Number");
            n = s.nextInt();
            found=false;
            eof=false;
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(n==mobilenumber)
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
            case 5: System.exit(0);
            default: System.out.println("Wrong Choice");
        }
        main();
    }
    void add() throws IOException
    {
        System.out.println("Enter Reg. Number");
        int n = s.nextInt();
        boolean found=false;
        boolean eof=false;
        while(!eof)
        {
            try
            {
                int regnumber = dis.readInt();
                int rollnumber = dis.readInt();
                String name = dis.readUTF();
                String adress = dis.readUTF();
                String gender = dis.readUTF();
                int mobilenumber = dis.readInt();
                if(n==regnumber)
                found=true;
            }
            catch(EOFException e)
            {
                eof=true;
            }
                    
            }    
        if(found)
        {
        System.out.println("Student is already registered");
        }
        else
        {
        System.out.println("Not Found,Creating New Record");
        System.out.println("Enter Reg. Number");
        dos.writeInt(s.nextInt());
        System.out.println("Enter Roll. Number");
        dos.writeInt(s.nextInt());
        System.out.println("Enter Full Name");
        dos.writeUTF(s.next());
        System.out.println("Enter Adress");
        dos.writeUTF(s.next());
        System.out.println("Enter Gender");
        dos.writeUTF(s.next());
        System.out.println("Enter Mobile Number");
        dos.writeInt(s.nextInt());
        }
        main();
    }
    void generate() throws IOException
    {
        boolean eof; int n;
        System.out.println("Enter 1 for listing by roll number, 2 for listing by name and 3 to quit");
        int c = s.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter first roll. no.");
            int min= s.nextInt();
            System.out.println("Enter last roll. no.");
            int max= s.nextInt();
            int i;
            eof=false;
            
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(rollnumber>=min && rollnumber<=max)
                    {
                    System.out.println(name);    
                    dos2.writeUTF(name);
                    }
                }
                catch(EOFException e)
                {
                    eof=true;
                }
                    
            }
            break;
            case 2:
            System.out.println("Enter a letter");
            char ch=s.next().charAt(0);
            eof=false;
            while(!eof)
            {
                try
                {
                    int regnumber = dis.readInt();
                    int rollnumber = dis.readInt();
                    String name = dis.readUTF();
                    String adress = dis.readUTF();
                    String gender = dis.readUTF();
                    int mobilenumber = dis.readInt();
                    if(ch==name.charAt(0))
                    {
                        System.out.println(name);
                        dos2.writeUTF(name);
                    }
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
