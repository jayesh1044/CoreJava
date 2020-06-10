package Fibonacci;

import java.util.Scanner;


public class MemoizationDemo {
	
	public int len;
	final int NIL = -1;
	
	public int[] lookup;
	
	public MemoizationDemo(int len){
		this.len = len;
		this.lookup = new int[len];
	}
	
	public void initialize() 
	{
		for(int i = 0 ; i < len; i++)
		{
			lookup[i]= NIL;
		}
		
	}
	public int fibMemoization(int num)
	{
		if(lookup[num]==NIL)
		{
			if(num <=1)
			{
				lookup[num]=num;
			}
			else
			{
				lookup[num]=fibMemoization(num-1)+fibMemoization(num-2);
			}
		}
		
		return lookup[num];
		
	}
	public int fibTabulation(int num)
	{
		lookup[0]=0;
		lookup[1]=1;
		int i = 2;
		while(i <= num)
		{
			lookup[i]= lookup[i-1]+lookup[i-2];
			i++;
					
		}
		
		return lookup[num];
	}
	public void displayTable() 
	{
		
		System.out.println("LookUp Table");
		System.out.println("Number \t Result");
		int i =0;
		//Enhanced for loop
		for(int num : this.lookup)
		{
			System.out.println(i + "\t" + num);
			i++;
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series finder using Dynamic Programming");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		MemoizationDemo m = new MemoizationDemo(num+1);
		m.initialize();
		
		System.out.println("1. Using Memoization");
		System.out.println("2. Using Tabulation");
		
		

		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Output "+m.fibMemoization(num));
			m.displayTable();
			break;
			
		case 2:
			System.out.println("Output "+m.fibTabulation(num));
			m.displayTable();
			break;
			

		default:
			System.out.println("Please Enter Correct Choice");
			break;
		}
		
		
		
		//System.out.println("Output using Memoization "+m.fibMemoization(num));
		
		
				

	}

}
