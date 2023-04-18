
public class CoundofVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hai, how are you";
		int vc=0;
		int cc=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				vc++;
			}
			else
				cc++;
		}
		System.out.println("vcount is " +vc);
		System.out.println("ccount is "+cc);

	}

}
