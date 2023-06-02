package week05;

public class App {

	public static void main(String[] args) {

		Logger astericklog = new AsteriskLogger();
		astericklog.log("Hello");

	System.out.println("-----------------------------------");	
	
		Logger error = new AsteriskLogger();
		error.error("Hello");
			
		System.out.println("-----------------------------------");	

		Logger spacedlog = new SpacedLogger();
		spacedlog.log("Hello");
	
		System.out.println("");	
		System.out.println("-----------------------------------");	

		System.out.print("ERROR: ");
		
		Logger spacederror = new SpacedLogger();
		spacederror.log("Hello");
		
		

//		print line in the above printout is missing the ln so it prints across
//		the blank print line below is so that it goes back to printing vertical
//System.out.println("");



	}

}
