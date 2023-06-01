package week05;

public class App {

	public static void main(String[] args) {

		Logger log = new AsteriskLogger();
		log.log("Hello");

System.out.println("------------------------------------------------");		
		
		Logger error = new AsteriskLogger();
		error.error("Hello");

System.out.println("------------------------------------------------");		

		
	}

}
