
public class CharacterclassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=" Sukeerthi is good. Sukeerthi";
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());


//TRIM
//removes black space
System.out.println(s1.trim());

//Starts with and ends with 

System.out.println(s1.startsWith(" "));
System.out.println(s1.endsWith("i"));

//CharAt

System.out.println(s1.charAt(4));
System.out.println(s1.charAt(2));

//String replace
System.out.println(s1.replace("Sukeerthi", "keerthi"));
	}

}
