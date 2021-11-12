package jsonreadwriteOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonwriteSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject=new JSONObject();
		jsonObject.put("age", 2);
		jsonObject.put("name", "kavin");
		
		JSONArray array=new JSONArray();
		array.add("shouting");
		array.add("loves his brother");
		
		jsonObject.put("special qualities", array);
		
		FileWriter filewriter=new FileWriter("kavin.json");
		
		BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
		bufferedwriter.write(jsonObject.toJSONString());
		//bufferedwriter.write(jsonObject.toString());
		bufferedwriter.close();
	}

}
