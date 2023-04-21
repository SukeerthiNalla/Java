
public class Charfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=" hai my name is sukeerthi";
//int[] c = new int[s1.length()];
char[] string=s1.toCharArray();
int c=0;
for(int i=0;i<s1.length();i++)
{
	c=1;
for(int j=i+1;j<s1.length();j++)
{
	if(string[i]==string[j])
		c++;
}
if(string[i]!=' ' && string[i]!='0')
{
	//System.out.println(string[i], c);
	System.out.println(string[i]+ " "+c);
}
	}
	}
}
