package odev2;

public class Main {

	public static void main(String[] args) {
	/*	GetterAndSetter product=new GetterAndSetter();
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
		System.out.println(dortislem.topla2(2, 3, 5)); */
		
/*		Customer customer=new Customer();
		Employee employee=new Employee();
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		employeeManager.BestEmployee(); */
		
	//	OgretmenKrediManager ogretmenkredimanager=new OgretmenKrediManager();
	//	ogretmenkredimanager.Hesapla();
	/*	KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager()); */
		
//		EmailLogger logger=new EmailLogger();
//		logger.Log("Log mesajı");
		
	/*	BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
		for(BaseLogger logger:loggers)
		{
			logger.Log("Log mesajı");
		} */
		
	//	CustomerManagerLogger customerManagerLogger=new CustomerManagerLogger(new DatabaseLogger());
	//	CustomerManagerLogger customerManagerLogger=new CustomerManagerLogger(new FileLogger());
	//	customerManagerLogger.add();
		
	/*	OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.Hesapla(1000)); */
		
	/*	BaseKrediManager[] krediManagers=new BaseKrediManager[]
				{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager krediManager:krediManagers)
		{
			System.out.println(krediManager.Hesapla(1000));
			
		} */
		
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator=new WomanGameCalculator();
		
				
			
		
		
		
	
		
		

	}

}
