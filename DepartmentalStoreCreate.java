import java.io.*;
class DepartmentalStoreCreate
{
    void main() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("C:/Users/adity/Desktop/Binary File/store.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        FileInputStream fis = new FileInputStream("C:/Users/adity/Desktop/Binary File/store.dat");
        DataInputStream dis = new DataInputStream(fis);
        FileOutputStream fos2 = new FileOutputStream("C:/Users/adity/Desktop/Binary File/trans.dat");
        DataOutputStream dos2 = new DataOutputStream(fos);
        FileInputStream fis2 = new FileInputStream("C:/Users/adity/Desktop/Binary File/trans.dat");
        DataInputStream dis2 = new DataInputStream(fis);
    }
}