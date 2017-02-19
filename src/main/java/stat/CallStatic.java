package stat;

public class CallStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CheckStatic.statMethod();
		
		CheckStatic stat = new CheckStatic();
		stat.statMethod();
		
		CheckStatic.statMethod();
		System.out.println(CheckStatic.color);


	}

	
	
	
	
	
	
	
	
	
	
	
}
