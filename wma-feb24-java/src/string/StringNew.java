package string;

public class StringNew {

	public static void main(String[] args) {
//		char[] ch= {'j','a','v','a'};//is same as 
//		String s=new String(ch);//is same as String s="java";
//		
//	
//		System.out.println(ch[0]);
//		System.out.println(s);
		
//		 String str = "abc";

		 char data[] = {'a', 'b', 'c'};
		 String str = new String(data);
		  

		  System.out.println("abc");
		  String result = "xyz";
		  System.out.println("abc" + result);
		  String c = "abc".substring(1, 2);
		  System.out.println(c);
		  String d = result.substring(1, 2);
		  System.out.println(d);

		  

	}
}
