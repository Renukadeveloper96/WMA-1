package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		int x=10;	
		long y=x;
		float z=y;
		
		System.out.println("before conversion ,int value :"+x);
		System.out.println("after  conversion ,long value :"+y);
		System.out.println("after conversion ,float value :"+z);
		
		double d=166.66;
		long l=(long)d;
		int i=(int)l;
		System.out.println("before conversion: "+d);
		System.out.println("after conversion into long type: "+l);
		System.out.println("after conversion into int type: "+i);

	}

}
