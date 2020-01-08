package AbsCasestudy2;

public class StarDoor extends Door{

	private int numberOfStars;
	public StarDoor(String doorName, int numberOfStars) {
		super(doorName);
		this.numberOfStars=numberOfStars;
	}
	public int getStar() {
		return numberOfStars;
	}
	public void setStar(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
	void unlock()
	{
		for(int i=numberOfStars;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");	
		}
	//	System.out.print("\n");
		for(int i=1;i<=numberOfStars;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
	}
	}
}
