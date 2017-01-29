package day2;

public class Holidays {
	public String publicHolidays="New Year";
	private String privateHolidays="Feb 14";
	String defaultHolidays="Saturday And Sunday";
	protected String protectedHolidays="Vinayagar Chathurthi";
	public static void main(String[] args) {
		Holidays obj=new Holidays();
		System.out.println(obj.publicHolidays);
//		System.out.println(obj.);
	}
	public void printHolidays() {
		System.out.println(publicHolidays);
		System.out.println(privateHolidays);

	}
}
