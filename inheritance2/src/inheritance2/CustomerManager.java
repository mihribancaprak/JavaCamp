package inheritance2;

public class CustomerManager {
    public void add(BaseLogger baseLogger) { // BaseLogger referans tutucu (DatabaseLogger,EmailLogger...) g�revi g�r�r
    	//M��teri ekleme kodlar�
    	System.out.println("M��teri eklendi");
    	
    	baseLogger.log();
    }
}
