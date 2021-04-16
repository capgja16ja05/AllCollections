package day6.task2;

// its an Object 
public class Employee {

	private String empName;
	private int id;
	private int salary;
	private String projectName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int id, int salary, String projectName) {
		super();
		this.empName = empName;
		this.id = id;
		this.salary = salary;
		this.projectName = projectName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Override
	public int hashCode() {
	  // 1000 line code
		System.out.println("====>> Hashcode called for "+empName);
		int myHashCode = 0;
		myHashCode = empName.length()+id+projectName.length();
		return myHashCode;
	}
	

	@Override    //        (Animal a)
	public boolean equals(Object obj) {
		System.out.println(" =====>> Equals called for "+empName);
		
		boolean isSame = false;
		// code to compare e1 and e2
		
		if(obj instanceof Employee)
		{
		  Employee e = (Employee)obj;	
		  
		  boolean a = this.empName.equals(e.empName);
		  boolean b = (this.id == e.id);
		  boolean c = this.salary == e.salary;
		  boolean d = this.projectName.equals(e.projectName);
		  
		  return a&&b&&c&&d;
			
		}
		return isSame;
	}
	
	

	
	@Override
	public String toString() {
		return id+" - "+empName+" - "+salary+" - "+projectName;
	}
	
}
