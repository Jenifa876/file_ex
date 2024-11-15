import java.io.File;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
public class File_Ex {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			File f=new File("vedha.txt");
			File of=new File("jepa.txt");
			FileOutputStream fos=new FileOutputStream(f);
			DataOutputStream dos=new DataOutputStream(fos);
			if(f.createNewFile())
			{
				System.out.println("File created successfully "+f.getName());
			}
			else
				System.out.println("File already exists "+f.getName());
			if(of.createNewFile())
			{
				System.out.println("File created successfully"+of.getName());
			}
			else
			{
				System.out.println("File already exists "+of.getName());
			}
			String s[]= {"hi","hello","world"};
			for(String str:s)
			{
				dos.writeUTF(str);
			}
			FileInputStream fis=new FileInputStream(f);
			DataInputStream dis=new DataInputStream(fis);
			while(dis.available()>0)
			{
				String l=dis.readUTF();
				System.out.println(l);
			}
			FileInputStream fis1=new FileInputStream(f);
			DataInputStream dis1=new DataInputStream(fis1);
			FileOutputStream fos1=new FileOutputStream(of);
			DataOutputStream dos1=new DataOutputStream(fos1);
			while(dis1.available()>0)
			{
				String l1=dis1.readUTF();
				dos1.writeUTF(l1);
			}
			System.out.println("File is copied Successfully");
		}
		catch(Exception e) {
			System.out.println("Exception caught");
		}

	}

}
