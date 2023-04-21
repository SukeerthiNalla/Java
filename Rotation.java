
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcde";
String s2= "eabcd";

if(s1.length()!=s2.length())
{
	System.out.println("rotation not possible");
}
else 
{
	s1=s1.concat(s1);
	
	if(s1.indexOf(s2)!=-1)
	
		System.out.println("rotaion possible" +s1);
	
	else 
	System.out.println("not possible "+s1);
}

	}

}
