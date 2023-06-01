package week05;

//import java.util.ArrayList;
//import java.util.List;

public class AsteriskLogger implements Logger {

	
	public void log(String log) {
	
		System.out.println("***" + log + "***");
	}
//		
//		List<String> log1 = new ArrayList<String>();
//		log1.add("George");
//		log1.add("Steven");
//		log1.add("Sammy");
//		System.out.println("***" + log1 + "***");}

		
	

	public void error(String error) {
		System.out.println("*******************");
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println("*******************");
	
	}
	
	


}
