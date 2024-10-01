package project3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_crud 
{

	public static void readData(String filePath) throws Exception 
	{
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		try 
		{
			String line;
			boolean firstLine = true;
			while((line = br.readLine()) != null) 
			{
				String[] values = line.split(",");
				if (firstLine) 
				{
					project3.headers = values;
					firstLine = false;
				}
				else 
				{
					project3.data.add(values);
				}
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Error reading this file.");
			e.printStackTrace();
		}
	}
}
