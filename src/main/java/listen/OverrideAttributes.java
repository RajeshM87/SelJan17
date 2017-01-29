package listen;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class OverrideAttributes implements IAnnotationTransformer,ITestAnnotation,ISuiteListener {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if (testMethod.getName().equals("editLead"))
			annotation.setInvocationCount(1);
		if (testMethod.getName().equals("createLead"))
			annotation.setEnabled(false);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

	@Override
	public long getTimeOut() {

		return 0;
	}

	@Override
	public void setTimeOut(long l) {
		
		
	}

	@Override
	public String[] getGroups() {
		
		return null;
	}

	@Override
	public void setGroups(String[] groups) {
		
		
	}

	@Override
	public String[] getDependsOnGroups() {
		
		return null;
	}

	@Override
	public void setDependsOnGroups(String[] groups) {
		
		
	}

	@Override
	public String[] getDependsOnMethods() {
		
		return null;
	}

	@Override
	public void setDependsOnMethods(String[] dependsOnMethods) {
		
		
	}

	@Override
	public String getDescription() {
		
		return null;
	}

	@Override
	public void setDescription(String description) {
		
		
	}

	@Override
	public String[] getParameters() {
		
		return null;
	}

	@Override
	public boolean getEnabled() {
		
		return false;
	}

	@Override
	public void setEnabled(boolean enabled) {
		
		
	}

	@Override
	public int getInvocationCount() {
		
		return 0;
	}

	@Override
	public void setInvocationCount(int l) {
		
		
	}

	@Override
	public int getThreadPoolSize() {
		
		return 0;
	}

	@Override
	public void setThreadPoolSize(int n) {
		
		
	}

	@Override
	public int getSuccessPercentage() {
		
		return 0;
	}

	@Override
	public void setSuccessPercentage(int s) {
		
		
	}

	@Override
	public boolean getAlwaysRun() {
		
		return false;
	}

	@Override
	public void setAlwaysRun(boolean f) {
		
		
	}

	@Override
	public Class<?>[] getExpectedExceptions() {
		
		return null;
	}

	@Override
	public void setExpectedExceptions(Class<?>[] e) {
		
		
	}

	@Override
	public String getExpectedExceptionsMessageRegExp() {
		
		return null;
	}

	@Override
	public void setExpectedExceptionsMessageRegExp(String e) {
		
		
	}

	@Override
	public String getSuiteName() {
		
		return null;
	}

	@Override
	public void setSuiteName(String s) {
		
		
	}

	@Override
	public String getTestName() {
		
		return null;
	}

	@Override
	public void setTestName(String s) {
		
		
	}

	@Override
	public boolean getSequential() {
		
		return false;
	}

	@Override
	public void setSequential(boolean f) {
		
		
	}

	@Override
	public boolean getSingleThreaded() {
		
		return false;
	}

	@Override
	public void setSingleThreaded(boolean f) {
		
		
	}

	@Override
	public String getDataProvider() {
		
		return null;
	}

	@Override
	public void setDataProvider(String v) {
		
		
	}

	@Override
	public Class<?> getDataProviderClass() {
		
		return null;
	}

	@Override
	public void setDataProviderClass(Class<?> v) {
		
		
	}

	@Override
	public IRetryAnalyzer getRetryAnalyzer() {
		
		return null;
	}

	@Override
	public void setRetryAnalyzer(Class<?> c) {
		
		
	}

	@Override
	public boolean skipFailedInvocations() {
		
		return false;
	}

	@Override
	public void setSkipFailedInvocations(boolean skip) {
		
		
	}

	@Override
	public long invocationTimeOut() {
		
		return 0;
	}

	@Override
	public void setInvocationTimeOut(long timeOut) {
		
		
	}

	@Override
	public boolean ignoreMissingDependencies() {
		
		return false;
	}

	@Override
	public void setIgnoreMissingDependencies(boolean ignore) {
		
		
	}

	@Override
	public int getPriority() {
		
		return 0;
	}

	@Override
	public void setPriority(int priority) {
		
		
	}

	@Override
	public void onStart(ISuite suite) {
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		
		
	}

}
