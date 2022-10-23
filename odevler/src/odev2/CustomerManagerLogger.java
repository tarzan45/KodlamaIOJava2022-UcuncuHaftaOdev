package odev2;

public class CustomerManagerLogger {
	
	private BaseLogger logger;
	
	public CustomerManagerLogger(BaseLogger logger)
	{
		this.logger=logger;
	}
	
	public void add()
	{
		System.out.println("Müşteri eklendi.");
		this.logger.log("Log mesajı");
		/*DatabaseLogger logger=new DatabaseLogger();
		logger.Log("Log mesajı");*/
	}

}
