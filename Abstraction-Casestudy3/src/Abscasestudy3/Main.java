package Abscasestudy3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String         starName;
		String         constellationName;
		int            decayIndex;
		int            energyToEmit;
		int currentAge;
		int energyconsume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Star Details\n");
		System.out.println("Enter Star name:");
		starName=sc.next();
		System.out.println("Enter constellationName:");
		constellationName=sc.next();
		System.out.println("Enter decayIndex:");
		decayIndex=sc.nextInt();
		System.out.println("Enter energyToEmit:");
		energyToEmit=sc.nextInt();
		System.out.println("Calculate Emission Rate");
		System.out.println("Enter age:");
		currentAge=sc.nextInt();
		System.out.println("Enter energyconsume:");
		energyconsume=sc.nextInt();
		int type;
		System.out.println("1.Plasma Star\r\n"+ "2.Radium Star\r\n"+ "3.Dark Star");
		type=sc.nextInt();
		if(type==1)
		{
			PlasmaStar ps=new PlasmaStar(starName,constellationName,currentAge,energyToEmit, energyconsume,decayIndex);
			ps.calculateEmissionRate();
			ps.display();
		}
		else if(type==2)
		{
			RadiumStar rs=new RadiumStar(starName,constellationName,currentAge,energyToEmit,energyconsume,decayIndex);
			rs.calculateEmissionRate();
			rs.display();
		}
		else if(type==3)
		{
			DarkStar ds=new DarkStar(starName,constellationName,currentAge,energyToEmit,energyconsume,decayIndex);
			ds.calculateEmissionRate();
			ds.display();
		}
	}

}
