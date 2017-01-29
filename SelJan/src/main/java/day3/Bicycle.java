package day3;

public class Bicycle {
	public Bicycle(){
		System.out.println("Constructor ");
	}
	
	public Bicycle(int wheels){
		System.out.println("Oveloading Constructor ");
	}
	public String colour = "Red";
	public int numWheels = 2;
	public boolean hasLock = false;
	
	public void applyBrake(){
		System.out.println("Applied Brake");
	}
	
	public void changeColour(String colour){
		System.out.println("Changed colour :"+colour);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
