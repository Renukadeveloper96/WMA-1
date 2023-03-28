package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(100);
		l.add(1111111);
		l.add(200);
		l.add(300);
		l.add("raju");
		l.add("raju");
		l.add("rani");
		l.add("rani");
		l.add(100.60);
//		l.set(1, 23);
//		l.remove(0);
		
//		l.add(1, 23);
		System.out.println(l.lastIndexOf("raju"));
		System.out.println(l.indexOf("rani"));
		System.out.println(l);
		System.out.println(l.contains("rajus"));
		System.out.println(l.get(3));
		System.out.println();

	}

}
