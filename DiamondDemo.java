
package org.jayesh.serialization;
import java.util.*;

class Animal
{
	public int legs;
	public String color;
	public Animal(int legs,String color)
	{
		this.legs=legs;
		this.color=color;
	}
	public void display()
	{
		System.out.println(legs+" " + color);
	}
	
}
class Dog extends Animal
{
	
	public String name;
	public Dog(int legs,String color,String name)
	{
		super(legs,color);
		this.name=name;
		
	}
	public void display()
	{
		System.out.println(name+" " +legs+" " + color);
	}
}
class Cat extends Animal
{
	
	public String name;
	public Cat(int legs,String color,String name)
	{
		super(legs,color);
		this.name=name;
	}
	public void display()
	{
		System.out.println(name+" " +legs+" " + color);
	}
}

public class DiamondDemo {
		
	public static void main(String[] args)
	{
		List<Animal> al = new ArrayList<Animal>();
		Animal a = new Animal(4,"white");
		
		Dog d = new Dog(4, "brown", "Rocky");
		Cat c = new Cat(4, "black", "Missy");
		
		al.add(a);
		al.add(d);
		al.add(c);
		
		for(Animal obj : al)
		{
			obj.display();
		}
		
	}
}
