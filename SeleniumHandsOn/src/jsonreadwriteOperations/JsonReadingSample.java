package jsonreadwriteOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingSample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonParser=new JSONParser();
		
		FileReader filereader=new FileReader("kavin.json");
		
		BufferedReader bufferedreader=new BufferedReader(filereader);
		
		Object parsedcontent=jsonParser.parse(bufferedreader);
		
		JSONObject jsonObject=(JSONObject) parsedcontent;
		
		String name=(String) jsonObject.get("name");
		Long age=(Long) jsonObject.get("age");
		
		JSONArray features=(JSONArray) jsonObject.get("special qualities");
		Iterator iterator=features.iterator();
		
		System.out.println("Name:"+ name);
		System.out.println("Age:" +age);
		
		while(iterator.hasNext()) {
			System.out.println("special qualities:" +iterator.next());
		}
		
	}

}
