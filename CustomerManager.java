
public class CustomerManager {
	private BaseLogger logger; //TEMEL NESNE(BASELOGGER) İLE ÇALIŞIYORUZ.
	
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
		
	}
	public void add() {
		System.out.println("Sisteme eklendi.");
		this.logger.log("Log mesajı: ");
		
	}
	

}
