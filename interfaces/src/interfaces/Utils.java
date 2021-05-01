package interfaces;

public class Utils {
	
    public static void runLoggers(BaseLogger[] baseLoggers,String message) {
    	
    	for(BaseLogger logger : baseLoggers) {
			
		    logger.log(message);
		}
    }
}
