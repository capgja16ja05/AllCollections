package day8.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day6.task2.Employee;

public class SetDemo {

	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(45);
		set.add(145);
		set.add(405);
		set.add(45);
		set.add(454);
		set.add(1);
		
		
		//System.out.println(set);
		//System.out.println(set.size());
		//set.get(4); // Set dont have get method
		new SetDemo().doSetThings();
	}
	
	public void doSetThings()
	{
		Employee e1 = new Employee("mike",101,2000,"ICICI-Bank");
		Employee e2 = new Employee("mike",101,2000,"ICICI-Bank");
		Employee e3 = new Employee("Ramesh",102,3000,"HDFC-Bank");//6+102+9=117
		Employee e4 = new Employee("A",104,3000,"HDFC-Bank");
		Employee e5 = new Employee("B",103,3000,"HDFC-Bank");
		Employee e6 = new Employee("A",104,3000,"HDFC-Bank");
		Employee e7 = new Employee("Rakesh A",100,3000,"HSBC-Bank");
		// 8+100+9 = 117
		
		
		
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e6);
		empSet.add(e7);
		
		
		System.out.println(" Employee Counts :- "+empSet.size());
		doPrintSet(empSet);
		
		
	}
	
	public void doPrintSet(Set<Employee> set)
	{
		Iterator<Employee> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println(e);
			System.out.println("\n-------------------------");
		}
		
	}
	
	
}//end main






















