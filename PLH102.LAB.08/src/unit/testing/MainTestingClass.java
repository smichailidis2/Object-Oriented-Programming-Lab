package unit.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTestingClass {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestTttEngine.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());		//prints failure ; if any
		}
		
		System.out.println(result.wasSuccessful());
	}

}
