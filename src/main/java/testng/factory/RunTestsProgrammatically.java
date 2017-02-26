package testng.factory;

import org.testng.TestNG;

public class RunTestsProgrammatically {

	public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(
        		new Class[] { ClassA.class , ClassB.class});
        testng.run();
    }
}
