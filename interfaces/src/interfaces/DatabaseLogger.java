package interfaces;

public class DatabaseLogger implements BaseLogger {

	@Override
	public void log(String message) {
       System.out.println("Database Loglandý :" + message);		
	}

}
