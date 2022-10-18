package odev2;

public class Main {

	public static void main(String[] args) {
		GetterAndSetter product=new GetterAndSetter();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(50000);
		product.setStockAmount(3);
		
		
		ProductManager productManager=new ProductManager();
	//	productManager.Add(product);
		
//		System.out.println(product.getKod());
		
		DortIslem dortislem=new DortIslem();
		System.out.println(dortislem.topla(2, 3));
		System.out.println(dortislem.topla2(2, 3, 7));
		
		

	}

}
