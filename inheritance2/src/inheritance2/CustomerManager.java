package inheritance2;

public class CustomerManager {
    public void add(BaseLogger baseLogger) { // BaseLogger referans tutucu (DatabaseLogger,EmailLogger...) görevi görür
    	//Müþteri ekleme kodlarý
    	System.out.println("Müþteri eklendi");
    	
    	baseLogger.log();
    }
}
