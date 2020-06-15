package com.org.learn;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,1,5,6,0,9,2,7,3};
		//ArrayList
		List<Integer> al = new ArrayList<Integer>();
		//LinkedList
		List<Integer> ll = new LinkedList<Integer>();
		//HashSet
		Set<Integer> hs = new HashSet<Integer>();
		//LinkedHashSet
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		//TreeSet
		SortedSet<Integer> ts = new TreeSet<Integer>();
		//HashMap
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		//LinkedHashMap
		Map<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
		//TreeHashMap
		SortedMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		//Custom Class objects
		List<Student> customAl = new ArrayList<Student>();
		Student s;
		s = new Student("Ram", 1);
		customAl.add(s);
		
		s = new Student("Jayesh", 2);
		customAl.add(s);
		
		s = new Student("Umar", 3);
		customAl.add(s);
		
		System.out.print("Original Data: ");
		for(int i = 0 ; i < arr.length; i++)
		{
			al.add(arr[i]);
			ll.add(arr[i]);
			hs.add(arr[i]);
			lhs.add(arr[i]);
			ts.add(arr[i]);
			hm.put(arr[i],i);
			lhm.put(arr[i],i);
			tm.put(arr[i],i);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("ArrayList: "+ al);
		System.out.println("LinkedList: "+ ll);
		System.out.println("HashSet: "+ hs);
		System.out.println("LinkedHashSet: "+ lhs);
		System.out.println("TreeSet: "+ ts);
		System.out.println("HashMap: "+ hm);
		System.out.println("LinkedHashMap: "+ lhm);
		System.out.println("TreeMap: "+ tm);
		System.out.println("Collection of custom objects");
		for(Student obj : customAl)
		{
			System.out.println(obj.getRoll()+ " "+ obj.getName() );
			
		}
		
		
		

	}

}
