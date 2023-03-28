package collections;

public class Student2 {

	
	private String name;
	private int    id;
	public Student2(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		
    Object[]a=new Object[100];
    a[0]=new Student2(101,"Raju");
    a[2]=new Student2(102,"ravi");
    a[3]=new Employee(104,"Rakesh",100000);
    System.out.println(a[3]);
	}

}
