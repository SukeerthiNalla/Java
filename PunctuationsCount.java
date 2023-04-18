
public class PunctuationsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hai, how are you. Iam fine.!";

int pcount=0;
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)==','||s1.charAt(i)=='.'||s1.charAt(i)=='!')
	{
		pcount++;
	}
}
System.out.println("count is" +pcount);
	}

}
