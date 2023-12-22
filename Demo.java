import java.util.Scanner;
class Demo{
	public static void main(String args[]){
	int a,b;
	Scanner sk=new Scanner(System.in);
	System.out.println("Enter Number 1 :");
	a=sk.nextInt();//6
	System.out.println("Enter Number 2 :");
	b=sk.nextInt();//6

	String r=(a>b)?"number 1 is greater":(a==b)?"both are equl":"number2 is greater";
	System.out.print(r);
	
	}
}