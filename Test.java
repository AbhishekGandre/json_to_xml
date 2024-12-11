package jsontoxml;

import org.json.JSONObject;
import org.json.XML;

public class Test {
	public static String convertJsontoxml(String xmlString) {
		JSONObject json = new JSONObject(xmlString);
        String xml = XML.toString(json);
		return xml;
		
	}
	
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"Abhishek Gandre\", \"role\": \"Software Developer\" }";
        JSONObject json = new JSONObject(jsonString);
        String xml = XML.toString(json);

        System.out.println(xml);
    }
}
