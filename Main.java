
public class Main {

	public static void main(String[] args) {
		BaseCrediManager[] credits= new BaseCrediManager[] {new TarimKrediManager() , new OgretmenCrediManager(),new OgrenciCrediManager()};
		for (BaseCrediManager credit:credits) {
			System.out.println(credit.hesapla(1200));
		}
		
	}
	 

}
