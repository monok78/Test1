import java.io.*;

public class Test1_A
{
	public static void main(String [] args)
	{
		
		String filenameA = "A.txt";
		
		try
		{
		
			FileWriter fwriter = new FileWriter(filenameA);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			bwriter.write("A1B2C3D4E5");
			
			bwriter.close();
		}
		
		catch(IOException ex)
		{
			System.out.println("An error existed to file " + filenameA + "!!!");
		}
	}
}