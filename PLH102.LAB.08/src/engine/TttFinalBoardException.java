package engine;

public class TttFinalBoardException extends Exception{
	
	private int errorCode;
	private String errorDescription;
	
	public TttFinalBoardException() {
		super("TttFinalBoardException");
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
