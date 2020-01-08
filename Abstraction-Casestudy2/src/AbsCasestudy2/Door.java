package AbsCasestudy2;

public abstract class Door {

	private String doorName;
	public Door(String doorName) {
		this.doorName=doorName;
	}
	abstract void unlock();
}
