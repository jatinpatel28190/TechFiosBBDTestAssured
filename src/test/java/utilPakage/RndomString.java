package utilPakage;

import org.apache.commons.lang3.RandomStringUtils;

public class RndomString {
	
	
	public static String getname() {
		
		String name = RandomStringUtils.randomAlphabetic(1);
		return ("laptop model - "+name);
	}
	
public static String getPrice() {
		
		String price = RandomStringUtils.randomNumeric(1);
		return ("800 - "+price);
	}
	
	
public static String getdescription() {
	
	String description = RandomStringUtils.randomAlphabetic(1);
	return ("very good laptop model - "+description);
}
	

}

