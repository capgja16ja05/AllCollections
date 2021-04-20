package day8.task1;

import java.util.Comparator;

import day6.task2.Employee;

public class SortEmployeeBasedOnSalary implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getSalary()-o1.getSalary() ;
	}
	
}
