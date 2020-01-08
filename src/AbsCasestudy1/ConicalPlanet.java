package AbsCasestudy1;

public class ConicalPlanet extends Planet {

	private float radius;
	 private float height;
	 private float result;
	
	public ConicalPlanet(String planetname, float height, float radius) {
		// TODO Auto-generated constructor stub
		super(planetname);
		this.height=height;
		this.radius=radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	float calculateVolume()
	{
		result=((float)3.14*radius*radius*height)/3;
		return result;
	}
}
