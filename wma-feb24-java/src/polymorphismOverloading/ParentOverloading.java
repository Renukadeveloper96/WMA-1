package polymorphismOverloading;

public class ParentOverloading {
	
	
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b,int c) {
		return a*b*c;
		
	}

	public static void main(String[] args) {
		System.out.println("method overloading");
		ParentOverloading parentOverloading=new ParentOverloading();
		System.out.println(parentOverloading.add(1,2));
		System.out.println(parentOverloading.add(1,2,4));
		
	}
}
