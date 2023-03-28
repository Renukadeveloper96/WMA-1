package inheritance;

public class Parent extends GrandParent{

	private String degree;
	
	public Parent(String name, int age, String farmer, String land, String degree) {
		super(name, age, farmer, land);
		this.degree = degree;
	}
	

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Parent [degree=" + degree + "]";
	}

	
	
	
}
