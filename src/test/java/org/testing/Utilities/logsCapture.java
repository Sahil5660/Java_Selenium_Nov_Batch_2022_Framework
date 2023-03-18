package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logsCapture {
	
	public static void CaptureLogs(String ClassName,String message) {
		DOMConfigurator.configure("../YT_Framework_Nov2022Batch/layout.xml");
		Logger l=Logger.getLogger(ClassName);
		l.info(message);
	}

}
