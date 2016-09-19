/**
 * 
 */
package ts.java.jni.errors;

/**
 * @author sergouniotis
 *
 */
public class CommunicationError extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3222601676604595333L;

	public CommunicationError() {
		super();
	}

	public CommunicationError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CommunicationError(String message, Throwable cause) {
		super(message, cause);
	}

	public CommunicationError(String message) {
		super(message);
	}

	public CommunicationError(Throwable cause) {
		super(cause);
	}

}
