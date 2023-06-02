package week05;



public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i) + " ");
// print line is missing the ln so it prints across
		
		}
		}
//}
	
	@Override
	public void error(String spacederror) {
		System.out.println("Error");
		System.out.println("***" + "ERROR: " + spacederror + "***");

	}
	

}
