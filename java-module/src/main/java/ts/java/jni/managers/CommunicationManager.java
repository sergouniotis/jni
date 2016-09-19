package ts.java.jni.managers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ts.java.jni.c.CInterface;
import ts.java.jni.errors.CommunicationError;

public class CommunicationManager {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommunicationManager.class);

	private CInterface cInterface;

	public CommunicationManager() {
		this.cInterface = new CInterface();
	}

	public void uname() throws CommunicationError {
		try {
			System.loadLibrary("ts_com_service");
			int result = cInterface.uname();
			LOGGER.info(String.valueOf(result));
		} catch (Exception e) {
			throw new CommunicationError(e);
		}
	}

}
