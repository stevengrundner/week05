package week05;

public class App {

	public static void main(String[] args) {

		Logger astericklog = new AsteriskLogger();
		astericklog.log("Hello");

		
		Logger error = new AsteriskLogger();
		error.error("Fred");
			

		Logger spacedlog = new SpacedLogger();
		spacedlog.log("Steven");
		
		
		

//		print line in the above printout is missing the ln so it prints across
//		the blank print line below is so that it goes back to printing vertical
//System.out.println("");



	}

}
