
public class Main {

	public static void main(String[] args) {
		BaseLogger logger=new BaseLogger();
		logger.log("Loglama yapıldı" );
		
		BaseLogger[] loggers=new BaseLogger[] {new DatabaseLogger() , new FileLogger() , new EmailLogger() };
		for(BaseLogger loger :loggers) { // BURAYA BASE DIŞINDA FİLE YA DA DATABASE YAZAMAZDIK ÇÜNKÜ BASELOGGER İÇİNDE HER ŞEY OLABİLİRDİ
			//YAZILAN DIŞINDA BİR ŞEY OLDUPU İÇİN VE BASELOGGER TEMEL OLDUĞU İÇİN ONU YAZMALIYIZ.
			loger.log("Log Mesajı ");
			
			//BU YÖNTEM KULLANILIRAK SİSTEME İSTENİLEN KADAR VERİ EKLEYEBİLRİZ.
			//YENİ BİR ŞEY EKLENDİĞİNDE YA DA SİLİNDİĞİNDE KOLAY YAPILABİLİR.TAK - ÇALIŞTIR SİSTEMİ
			
			
			
		}
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
		// DATABASE FİLE EMAİL GELEBİLİR. BİZ BURDA POLİMORFİZM YAPTIK GEVŞEK BAĞLILIK
		// DEĞİŞTİRMEK İSTERSEK SADECE BİR YERDEN DEĞİŞTİRİRİZ.
		customerManager.add();
		
		
	}
	



//OVERRİDİNG ETMEK BASELOGGER DA OLAN METHODU HEPSİNE YAZMAK DEMEK
//YAZMASAK DA OLUR ZORUNLU DEĞİL
// HERHANGİ BİR DEĞİŞİKLİK GELDİĞİNDE SADECE O CLASS DA DEĞİŞİKLİK OLUDĞU ZAMAN YAZABİLİRİZ DE 
}