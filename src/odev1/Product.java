package odev1;

public class Product 
{
	public Product()
	{
		
	}
	
	
	public Product(int _id, String name, String description, double price, int stockAmount, String renk) {
		//super();
		System.out.println("Yapıcı blok çalıştı.");
		this._id = _id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}


	private int _id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStockAmount() {
		return stockAmount;
	}


	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public String getKod() {
		return kod;
	}


	public void setKod(String kod) {
		this.kod = kod;
	}
	
	

}
