
public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hai hai how are you you doing";
int c=0;
//char string[]=s1.toCharArray(); 
String words[] = s1.split(" "); 

for(int i=0;i<words.length;i++)
{
	c=1;
	for(int j=i+1;j<words.length;j++)
	{
		if(words[i].equals(words[j]))
		c++;
	}
	
	if(c>1&&words[i]!="0")
	{
		System.out.println(words[i]);
	}

}

	}

}
