package Abscasestudy3;

public class PlasmaStar extends Star{
	

	public PlasmaStar(String starName, String constellationName, int currentAge, int energyToEmit,
			int energyToBeConsumed, int decayIndex) {
		super(starName, constellationName, currentAge, energyToEmit, energyToBeConsumed);
		this.decayIndex = decayIndex;
	}
	private int decayIndex;

	
	int c;
	int  calculateYearsRemaining()
	{
		int a=0,b=1;
		for(int i=1;i<=decayIndex-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		return c;
	}
}
