package org.testing.Assertions;

import org.testing.Utilities.logsCapture;

public class SoftAssertion {
	//Calling this soft assertion in TC2
	public static void softAssertion(String Actual,String Expected,String ClassName) {
		
		if(Actual.equals(Expected)) {
			logsCapture.CaptureLogs(ClassName, "Assertion is passed");
		}
		else {
			logsCapture.CaptureLogs(ClassName, "Assertion is Failed"); 
		}
	}

}
