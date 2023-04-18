
public class ChartoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c1[]= {'a','b','c','d','e'};
String s1=new String(c1);
String s2=new String("example");

System.out.println(s1);
System.out.println(s2);
	
	
	//CONCATINATION

	String s3= "Sukeethi";
	s3=s3.concat("Reddy");
	System.out.println(s3);
	
	
	//STRING COMPARE
	
	//Using equals
	String s4="Sukeerthi";
	String s5="Sukeerthi";
	System.out.println(s1.equals(s2));
	System.out.println(s5.equals(s4));
	
	//using ==
	
	System.out.println(s1==s2);
	System.out.println(s5==(s4));
	
	
	//COMPARE
	
	System.out.println(s1.compareTo(s3));
	System.out.println(s5.compareTo(s4));
			
	}
}
