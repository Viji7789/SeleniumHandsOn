package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="bufferedfilewriter.txt";
		String content="Learning buffered file writer";
		
		FileWriter filewriter=new FileWriter(location);
		
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		
		bufferedwriter.write(content);
		bufferedwriter.close();
	}

}
