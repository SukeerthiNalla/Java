
public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Remove space";
		//s1= s1.replaceAll("\\s")
		s1=s1.replaceAll("\\s+", "");
		System.out.println(s1);
	}

}
