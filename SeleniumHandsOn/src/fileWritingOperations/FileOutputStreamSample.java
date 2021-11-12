package fileWritingOperations;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="fileoutputstream.txt";
		String content="Learning file output stream";
	//used for writing raw byte array information(eg: images)
		
		FileOutputStream fileoutputstream=new FileOutputStream(location);
		
		byte[] writethis=content.getBytes();
		
		fileoutputstream.write(writethis);
		fileoutputstream.close();
	}

}
