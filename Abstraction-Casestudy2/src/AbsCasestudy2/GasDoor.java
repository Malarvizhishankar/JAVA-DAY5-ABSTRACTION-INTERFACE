package AbsCasestudy2;

public class GasDoor extends Door{

	private String  nameOfGas;
	public GasDoor(String doorName, String nameOfGas) {
		super(doorName);
		this.nameOfGas=nameOfGas;
	}
	public String getnameOfGas() {
		return nameOfGas;
	}
	public void setnameOfGas(String nameOfGas) {
		this.nameOfGas = nameOfGas;
	}
	void unlock()
	{
		String a=nameOfGas;
	      char[] ch = new char[a.length()]; 
	      int num=a.length();
	      int count=0;
	      for (int i = 0;i<a.length();i++) 
	      { 
	            ch[i] = a.charAt(i); 
	      }
	      if(num%2==0)
	      {
	         for(int i=0;i<num;i++)
	         {
	          for(int j=i+1;j<num;j++)
	          {
	              if(ch[i]==ch[j])
	              {
	                  ch[i]=0;
	                  count++;
	              }
	           }
	         }
	         if(count*2-num==0)
	         {
	          System.out.print("Never say never. Palindrome, forever.");
	         }
	          else
	          {
	          System.out.print("We cannot fish. Palindrome? You wish");
	          }
	        }
	        else if(num%2==1)
	        {
	           for(int i=0;i<num;i++)
	           {
	           for(int j=i+1;j<num;j++)
	            {
	              if(ch[i]==ch[j])
	              {
	                  ch[i]=0;
	                  count++;
	                  
	              }
	            }
	           }
	          if(num-count*2==1)
	          {
	          System.out.print("Never say never. Palindrome, forever.");
	          }
	          else
	          {
	          System.out.print("We cannot fish. Palindrome? You wish");
	          }
	          
	       }	
	}
}
