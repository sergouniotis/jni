package ts.java.jni.managers.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ts.java.jni.errors.CommunicationError;
import ts.java.jni.managers.CommunicationManager;

public class CommuniationManagerTestCase {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommuniationManagerTestCase.class);

	private CommunicationManager communicationManager;

	@Before
	public void init() {
		this.communicationManager = new CommunicationManager();
	}

	@Test
	public void testUname() {
		try {
			communicationManager.uname();
		} catch (CommunicationError e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getMessage());
		}
	}

}
