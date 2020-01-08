package AbsCasestudy2;

public class LiquidDoor extends Door{

	private float flowQuotient;
	
	public LiquidDoor(String doorName, float flowQuotient) {
		// TODO Auto-generated constructor stub
		super(doorName);
		this.flowQuotient=flowQuotient;	
	}
	public float getPrime() {
		return flowQuotient;
	}
	public void setPrime(int prime) {
		this.flowQuotient = flowQuotient;
	}
	void unlock()
	{
		 for (int i = 1; i <=flowQuotient*2; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		       {
	             if(i%num==0)
		       {
	 		   counter = counter + 1;
		     }
		   }
		  if (counter ==2)
		   {
		     int result;
		     result=(int)Math.pow(2,i)-1;
		     System.out.print(" "+result);
		   }	
	      }	
	  }
}
