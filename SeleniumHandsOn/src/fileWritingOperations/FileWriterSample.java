package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="filewriter.txt";
		String content="Learning file writer";
		
		FileWriter filewriter=new FileWriter(location);
		
		filewriter.write(content);
		filewriter.close();
	}

}
