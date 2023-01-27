package test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOFileHandlingDemo {

	public static void main(String[] args) {
		
		try {
		File myFile = new File("C:\\Users\\CT181LL\\OneDrive - EY\\Desktop\\Misc\\TestFile.txt");
		if (myFile.createNewFile())
		{
			System.out.println(myFile.getName());
		}
		else
		{
			System.out.println("File exists");
		}
		
		FileWriter fWrite =  new FileWriter(myFile, true);
		/*fWrite.write("Rani is good");
		fWrite.append("I am appending this");
		fWrite.close();
		
		*/
		
		BufferedWriter buffWriter = new BufferedWriter(fWrite);
		
		buffWriter.write("fghdgf");
		buffWriter.close();
		
		Scanner input = new Scanner(myFile);
		while(input.hasNextLine())
		
		{
			String str = input.nextLine();
			System.out.println(str);
		}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			e.toString();
		}

	}

}
