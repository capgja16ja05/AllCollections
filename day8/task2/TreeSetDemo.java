package day8.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import day6.task2.Employee;
import day8.task1.SortEmployeeBasedOnSalary;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(45);
		set.add(5);
		set.add(15);
		set.add(12);
		set.add(145);
		set.add(458);
		set.add(8);
		set.add(75);
		
		System.out.println(set);
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("abc");
		set2.add("aabc");
		set2.add("abbc");
		set2.add("cbsdj");
		set2.add("zabd");
		set2.add("zbhg");
		set2.add("tbc");
		set2.add("tca");
		
		System.out.println(set2);

		//----- TreeSet in case of Custom Data ------------------
		
		TreeSet<Employee> empSet = new TreeSet<>();
		
		Employee e1 = new Employee("mike",101,12000,"ICICI-Bank");
		
		Employee e3 = new Employee("Ramesh",102,3000,"HDFC-Bank");//6+102+9=117
		Employee e4 = new Employee("A",104,43000,"HDFC-Bank");
		Employee e5 = new Employee("B",103,30000,"HDFC-Bank");
		Employee e7 = new Employee("Rakesh A",100,31000,"HSBC-Bank");
	
		empSet.add(e1);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		empSet.add(e7);
		
		
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
		
		
		List<Employee> empSalaryBasedList = new ArrayList<>();
		empSalaryBasedList.addAll(empSet);
		
		Collections.sort(empSalaryBasedList,new SortEmployeeBasedOnSalary());
	
		System.out.println("===============================");
		for (Employee employee : empSalaryBasedList) {
			System.out.println(employee);
		}
		
		
	}
}













