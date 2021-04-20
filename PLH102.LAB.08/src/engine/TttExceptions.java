package engine;

public class TttExceptions extends Exception{
	
	private int errorCode;
	
	
	public final static int    WINNING_POSITION = 100;
	public final static String WINNING_POSITION_DESCRIPTION = "Wining condition reached";
	
	
	private String errorDescription;
	
	public TttExceptions(int errcode, String errDecription) {
		super("TttException");
		this.errorCode = errcode;
		this.errorDescription = errDecription;
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
