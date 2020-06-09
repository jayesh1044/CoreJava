
class Shape{
	public void display()
	{
		System.out.println("I am parent class");
	}
}

class Rect extends Shape{
	public void display()
	{
		System.out.println("I am rectangle");
		
	}
}

class Circle extends Shape{
	public void display()
	{
		System.out.println("I am circle");
		
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Rect();
		s.display();
		s = new Circle();
		s.display();
	}

}
