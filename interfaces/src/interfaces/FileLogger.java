package interfaces;

public class FileLogger implements BaseLogger {

	@Override
	public void log(String message) {
		
		System.out.println("Dosyaya Logland� :" + message);
	}

}
