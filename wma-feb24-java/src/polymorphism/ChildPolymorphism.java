package polymorphism;

public class ChildPolymorphism extends ParentPolymorphism{
	public void m1() {
		System.out.println("child");
	}
	public void m3() {
		System.out.println("child m3 method");
	}
	public int add(int a,int b) {
		return a-b;
		
	}
}
