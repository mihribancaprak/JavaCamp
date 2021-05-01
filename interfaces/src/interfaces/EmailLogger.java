package interfaces;

public class EmailLogger implements BaseLogger{

	@Override
	public void log(String message) {
       System.out.println("Email gönderildi : " + message);		
	}

}
