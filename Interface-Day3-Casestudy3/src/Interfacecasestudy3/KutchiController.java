package Interfacecasestudy3;

public class KutchiController implements iHumanActions, iRobotActions {

	
	float cash;
	int energy;
	
	public KutchiController(float cash, int energy) {
		super();
		this.cash = cash;
		this.energy = energy;
	}
	void             displayStatus  ()
	{
		System.out.println("Current energy levels and Cash");
		System.out.println("CASH:"+cash);
		System.out.println("ENERGY:"+energy);
	}

	public void performMaintenance(float hours) 
	{
		System.out.println("Consumes "+((hours/1.5)*3)+" energy and "+((hours/1.5)*7)+" cash ");
	}
	
	public void paintAndSell(float hours)
	{
		float n=hours/2;
		if(n>=1 && n<2)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 1 painting every 2 hours which are sold for 7 cash each");
		}
		else if(n>=2 && n<3)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 2 painting every 2 hours which are sold for 8 cash each");
		}
		else if(n>=3 && n<4)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 3 painting every 2 hours which are sold for 9 cash each");
		}
	}
	
	public void restFor(float hours) {
		
		System.out.println("Consumes "+((hours/2.5)+7)+" energy and "+((hours/2.5)-3)+" cash ");
	}
	
	public void buyStuff(String itemToBuy, int price) {
		
		System.out.println("Bought "+itemToBuy+" for "+price+ " amount");
		
	}
	
	public void socialize(float hours) {
		
		float e=((hours*60)/20)*2;
		System.out.println("Socialize:"+e);
	}
	
	public void workFor(float hours) 
	{
		System.out.println("Consumes "+(hours*5)+" energy and earns "+(hours*15)+" cash every hour");
		
	}
	
	
	
}
