package engine;

public class TttExceptions extends Exception{
	
	private int errorCode;
	
	private String errorDescription;
	
	public TttExceptions() {
		super("TttException");
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
}
