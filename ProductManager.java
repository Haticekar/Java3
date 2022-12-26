package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}


	public void add(Product product) throws Exception {
		//İŞ KURALLARI YAZILIR
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
			// HATA FIRLATILIRSA SİSTEM DURUR.
			
			
		}
		ProductDao productDao=new JdbcProductDao(); //HİBERNATE YA DA JDB YAZABİLİRİZ.
		productDao.add(product);
		
	}

}
