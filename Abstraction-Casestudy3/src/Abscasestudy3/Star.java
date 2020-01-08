package Abscasestudy3;

abstract public class Star {

	private String starName;
	private String constellationName;
	private int currentAge;
	private int energyToEmit;
	private	int energyToBeConsumed;
	
	abstract int  calculateYearsRemaining();
	 float result;
	
	 public Star(String starName, String constellationName, int currentAge, int energyToEmit, int energyToBeConsumed) {
			super();
			this.starName = starName;
			this.constellationName = constellationName;
			this.currentAge = currentAge;
			this.energyToEmit = energyToEmit;
			this.energyToBeConsumed = energyToBeConsumed;
		}
	
	
	public String getStarName() {
		return starName;
	}


	public void setStarName(String starName) {
		this.starName = starName;
	}


	public String getConstellationName() {
		return constellationName;
	}


	public void setConstellationName(String constellationName) {
		this.constellationName = constellationName;
	}


	public int getEnergyToEmit() {
		return energyToEmit;
	}


	public void setEnergyToEmit(int energyToEmit) {
		this.energyToEmit = energyToEmit;
	}


	public int getCurrentAge() {
		return currentAge;
	}


	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}


	public int getEnergyToBeConsumed() {
		return energyToBeConsumed;
	}


	public void setEnergyToBeConsumed(int energyToBeConsumed) {
		this.energyToBeConsumed = energyToBeConsumed;
	}
	
	public float calculateEmissionRate()
	{
		
		float c=energyToEmit-energyToBeConsumed;
		float d=(calculateYearsRemaining()-currentAge);
		result=c/d;  
		 return result;
	}
	public void display()
	{
		System.out.print("Star Details:"+starName+"\n");
		System.out.print("Constellation:"+constellationName+"\n");
		System.out.print("Emission rate:"+result);
	}
            
}
