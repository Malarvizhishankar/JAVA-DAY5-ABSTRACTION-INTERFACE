package AbsCasestudy2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doorName;
		Scanner sc=new Scanner(System.in);
        System.out.print("1.Star Door\r\n" + "2.Gas Door\r\n" + "3.Liquid Door");
        int choice;
        String nameOfGas;
        System.out.print("\nEnter Choice:");
        choice=sc.nextInt();
        System.out.print("Enter the Door name:");
        doorName=sc.next();
        int star;
        float flowQuotient;
        if(choice==1)
        {
        	star=sc.nextInt();
        	StarDoor sd=new StarDoor(doorName,star);
        	sd.unlock();
        }
        else if(choice==2)
        {
        	System.out.print("Enter name of gas:");
        	nameOfGas=sc.next();
        	GasDoor gd=new GasDoor(doorName,nameOfGas);
        	gd.unlock();
        }
        else if(choice==3)
        {
        	System.out.print("Enter flow Quotient:");
        	flowQuotient=sc.nextFloat();
        	LiquidDoor ld=new LiquidDoor(doorName,flowQuotient);
        	ld.unlock();
        }
	}

}
