package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import com.google.common.io.Files;

public class PathSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="path.txt";
		String content="Learning path for file writing";
		
		Path path=Paths.get(location);
		
		Files.write(path, content.getBytes());
		
	}

}
