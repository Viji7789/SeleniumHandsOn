package fileReadingSample;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="bufferedfilewriter.txt";
		
		FileReader filereader=new FileReader(location);
		
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		String Readertext;//=bufferedreader.readLine();
		//System.out.println(Readertext);
		//to read multiple lines in a file
		while((Readertext=bufferedreader.readLine())!=null) {
			System.out.println(Readertext);
		}
		//bufferedreader.close();
	}

}
