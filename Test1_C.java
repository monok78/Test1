import java.io.*;

public class Test1_C
{
	public static void main(String [] args)
	{
		
		String filenameC = "C.txt";
		
		try
		{
            
            byte[] buff = new byte[1000];

            FileInputStream isfile = new FileInputStream("B.bin");

            int total = 0;
            int nRead = 0;
			
            while((nRead = isfile.read(buff)) != -1)
			{
               
                System.out.println(new String(buff));
                total += nRead;
            }   

            
            isfile.close();        

			FileWriter fwriter = new FileWriter(filenameC);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			
			
			bwriter.write(new String(buff));
			
			bwriter.close();
            
        }
		
        catch(FileNotFoundException ex)
		{
            System.out.println( "Unable to open file '" + filenameC + "'");                
        }
		
        catch(IOException ex)
		{
            System.out.println("Error reading file '" + filenameC + "'");                  

        }

	}
}