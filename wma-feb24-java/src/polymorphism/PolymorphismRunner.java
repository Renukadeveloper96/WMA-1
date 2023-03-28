package polymorphism;

public class PolymorphismRunner {

	public static void main(String[] args) {
//		ParentPolymorphism ParentPolymorphism=new ParentPolymorphism();
//		ParentPolymorphism.m1();
//		ParentPolymorphism ParentPolymorphism=new ChildPolymorphism();
//		ParentPolymorphism.m1();
		ChildPolymorphism childPolymorphism=new ChildPolymorphism();
		childPolymorphism.m1();
		childPolymorphism.m2();
		childPolymorphism.m3();
		System.out.println(childPolymorphism.add(4,5));
	}

}
