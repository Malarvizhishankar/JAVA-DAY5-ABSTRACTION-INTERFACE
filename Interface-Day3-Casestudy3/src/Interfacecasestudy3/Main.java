package Interfacecasestudy3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		float cash;
		int energy;
		String itemToBuy;
		int price;
		float hours;
		Scanner s=new Scanner(System.in);
		System.out.println("cash:");
		cash=s.nextFloat();
		System.out.println("energy:");
		energy=s.nextInt();
		System.out.println("itemToBuy:");
		itemToBuy=s.next();
		System.out.println("price:");
		price=s.nextInt();
		System.out.println("hours:");
		hours=s.nextFloat();
		KutchiController kc= new KutchiController(cash,energy);
		//System.out.println("");
		kc.performMaintenance(hours);
		kc.paintAndSell(hours);
		kc.restFor(hours);
		kc.buyStuff(itemToBuy, price);
		kc.socialize(hours);
		
	}

}
