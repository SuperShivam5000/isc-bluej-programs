import java.io.*;
class StudentManagementCreate
{
    void main() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:/Users/adity/Desktop/Binary File/student.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        FileInputStream fis = new FileInputStream("C:/Users/adity/Desktop/Binary File/student.dat");
        DataInputStream dis = new DataInputStream(fis);
        FileOutputStream fos2 = new FileOutputStream("C:/Users/adity/Desktop/Binary File/temp.dat");
        DataOutputStream dos2 = new DataOutputStream(fos);
        FileInputStream fis2 = new FileInputStream("C:/Users/adity/Desktop/Binary File/temp.dat");
        DataInputStream dis2 = new DataInputStream(fis);
    }
}
