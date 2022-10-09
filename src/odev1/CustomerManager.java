package odev1;

public class CustomerManager
{
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {this.customerDal=customerDal;}
	
	public void add( ) 
	{
		customerDal.add();
	}
	
	public void remove() {System.out.println("Müşteri silindi.");}
	
	public void update() {System.out.println("Müşteri güncellendi.");}

}
