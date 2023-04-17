import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a,b,c;

Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a= sc.nextInt();
//Scanner s=new Scanner(System.in);
System.out.println("enter b value");
int b= sc.nextInt();
//Scanner x=new Scanner(System.in);
System.out.println("enter c value");
int c= sc.nextInt();

int temp = a>b?a:b;
int l = c>temp?c:temp;
	System.out.println(" largest is " +l);
//else if (b>c)
	//System.out.println("b is largest");
//else
	//System.out.println("c is largest");
	}

}
