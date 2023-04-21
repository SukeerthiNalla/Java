
public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HaiHow are you";
		int c=0;
		char string[] = str.toCharArray();  
		
for(int i=0;i<str.length();i++)
{
	c=1;
	for(int j=i+1;j<str.length();j++)
	{
		if(string[i]==string[j]&&string[i]!=' ')
		{
			c++;
			//string[j] = '0';    
			
		}
	}
	if(c>1)
		System.out.println(string[i]);
		//else
			//System.out.println("no duplicates");
	
}
	}

	}


