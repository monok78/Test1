import java.io.*;

public class Test1_B
{
	public static void main(String [] args)
	{
		
		String filenameB = "B.bin";
		
		try
		{
			File rfile = new File("A.txt");
			FileReader fread = new FileReader(rfile);
			BufferedReader bread = new BufferedReader(fread);
			StringBuffer sbuff = new StringBuffer();
			String a;
			String b; 
			String conv; 
			
			while((a=bread.readLine()) != null)
			{
				sbuff.append(a);
				sbuff.append("\n");
			}
		
			fread.close();
			b = sbuff.toString();
			
			byte[] sbyte = b.getBytes();
			byte[] result = new byte[sbyte.length];
			
			for(int i=0; i<sbyte.length; i++)
			{
				result[i] = sbyte[sbyte.length-i-1];
			}
			
			conv = new String(result);
			
			FileWriter fwriter = new FileWriter(filenameB);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			
			bwriter.write(conv);
			
			bwriter.close();
			System.out.println(conv + " (Binary)");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}