package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {  //PRODUCT DAO YU OLUŞTURDUKTAN SONRA BURAYI SİLDİĞİMİZDE BİR HATA ALMAYIZ.
		
		//SADECE DB ERİŞİM KODLARI YAZILIR(SQL)
		System.out.println("Jdbc ile eklendi.");
	}

}
