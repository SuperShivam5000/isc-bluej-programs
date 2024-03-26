import java.io.*;
class JAJA
{
    void main() throws IOException
    {
        FileReader fr = new FileReader("Student.txt");
        BufferedReader br = new BufferedReader(fr);
        String std,mks;
        while(true)
        {
            std=br.readLine();
            mks=br.readLine();
            if (std == null || mks == null) break;
            if(Integer.valueOf(mks)>=75)
            {
                System.out.println("Name" + std);
                System.out.println("Marks"+mks);
            }
        }
    }
}