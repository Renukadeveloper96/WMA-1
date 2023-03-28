package inheritance;

public class familyRunner {

	public static void main(String[] args) {
		Parent parent =new Parent("suresh",24,"farmer","2 acr","engineering");
		
		parent.getAge();
		parent.getFarmer();
		parent.getLand();
		parent.getDegree();
		System.out.println(parent.getName());
	}
}
