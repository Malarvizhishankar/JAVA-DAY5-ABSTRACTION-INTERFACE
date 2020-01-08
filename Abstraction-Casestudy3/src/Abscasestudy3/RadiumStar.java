package Abscasestudy3;

public class RadiumStar extends Star{

	
	public RadiumStar(String starName, String constellationName, int currentAge, int energyToEmit,
			int energyToBeConsumed, int decayIndex) {
		super(starName, constellationName, currentAge, energyToEmit, energyToBeConsumed);
		this.decayIndex = decayIndex;
	}

	private int decayIndex,temp;
	
	

	int  calculateYearsRemaining()
	{
		temp=(decayIndex*(decayIndex+1))/2;
		return temp;
	}
}
