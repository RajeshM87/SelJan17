package day2;

class Sample {
	static Sample obj=new Sample();
	public static void age() {
		System.out.println("Inside Age");
//		name();
	}
	private void name() {
		age();
		System.out.println("Test");
	}

	public static void main(String[] args) {
//		Sample obj=new Sample();
		obj.age();
		obj.name();
		System.out.println("Inside Main");
	}
	
}










