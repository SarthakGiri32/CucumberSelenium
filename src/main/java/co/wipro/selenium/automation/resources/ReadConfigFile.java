package co.wipro.selenium.automation.resources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadConfigFile extends Variables{

	protected static JSONArray createJsonArray() throws IOException, ParseException {
		//JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        String configFilePath = "src/main/resources/Configurations/Config.json";
        FileReader reader = new FileReader(configFilePath);
		Object obj = jsonParser.parse(reader);
		return (JSONArray) obj;
	}
	
	protected static void setVariables() throws IOException, ParseException {
		JSONArray jsonList = createJsonArray();
		boolean comVarsFlag = false;
		for (Object jsObj : jsonList) {
			JSONObject configObject = (JSONObject) jsObj;
			if (configObject.containsKey("commonVariables")) {
				JSONObject comVarObject = (JSONObject) configObject.get("commonVariables");
				VERIZON_WEBSITE = comVarObject.get("verizonHomePage").toString();
				CHROME_DRIVER = comVarObject.get("chromeDriveLocation").toString();
				WAIT_TIME = Integer.parseInt(comVarObject.get("seleniumWaitTime").toString());
				PAGE_LOAD_DELAY = Integer.parseInt(comVarObject.get("pageLoadDelay").toString());
				comVarsFlag = true;
			}
		}
		System.out.println(comVarsFlag ? "Reading Common Variables... SUCCESS!" : "Reading Common Variables... FAILED!");
	}
}
