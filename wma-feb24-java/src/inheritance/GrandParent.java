package inheritance;

public class GrandParent {

	private String name;
	private int age;
	private String farmer;
	private String land;
	
	
	public GrandParent(String name, int age, String farmer, String land) {
		super();
		this.name = name;
		this.age = age;
		this.farmer = farmer;
		this.land = land;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFarmer() {
		return farmer;
	}
	public void setFarmer(String farmer) {
		this.farmer = farmer;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	@Override
	public String toString() {
		return "GrandParent [name=" + name + ", age=" + age + ", farmer=" + farmer + ", land=" + land + "]";
	}
	
	
	
}
