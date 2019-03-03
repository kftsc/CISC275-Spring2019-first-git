
public class Animal {
	private String name;
	private int legs;
	
	public Animal(String x, int y) {
		name = x;
		legs = y;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public String toString() {
		return name + ": " + legs; 
	}
}
