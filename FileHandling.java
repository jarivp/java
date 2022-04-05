import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling 
{
	public static void main(String[] args) 
	{
		//open the file
		String filename = "C:\\Users\\DELL\\Desktop\\pra.txt\";
		String line = null;
		try
		{
			//read a file
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()));
			{
				System.out.println(line);
			}
		br.close();
		}
	catch(FileNotFoundException e)
	{
		System.out.println("Error file " + filename + " was not found!");
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
}