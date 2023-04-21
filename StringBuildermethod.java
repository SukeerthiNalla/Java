
public class StringBuildermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//append
		//String s="Hai"
StringBuilder sb=new StringBuilder("Hai");
sb.append("Hello");
System.out.println(sb);

//Insert

sb.insert(2,"B");
System.out.println(sb);

//replace
sb.replace(3, 5, "Nav");
System.out.println(sb);

//delete
sb.delete(2, 4);
System.out.println(sb);

//Reverse
sb.reverse();
System.out.println(sb);

	}

}
