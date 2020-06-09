
public class PolymorphismDemo1 {

	
	public static void display(int num)
	{
		System.out.println("I am Number: "+ num);
		
	}
	public static void display(String s)
	{
		System.out.println("I am String: "+ s);
		
	}
	public static void main(String[] args) {
		display(1);
		display("Jayesh");

	}

}
