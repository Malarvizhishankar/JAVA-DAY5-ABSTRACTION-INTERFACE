package Abscasestudy3;

public class DarkStar  extends Star {

	private int decayIndex;
	private int result=0; 
	

	public DarkStar(String starName, String constellationName, int currentAge, int energyToEmit, int energyToBeConsumed,
			int decayIndex) {
		super(starName, constellationName, currentAge, energyToEmit, energyToBeConsumed);
		this.decayIndex = decayIndex;
	}


	
	
	
	int  calculateYearsRemaining()
	{
		int num=1,i;
	    int count=0;
	 
	    while (count < decayIndex){
	      num=num+1;
	      for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){//if it is a prime number
	        count = count+1;
	      }
	    }
	    result=result + num;
	    return result;
	}

}
