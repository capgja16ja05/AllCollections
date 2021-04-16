package day6.task2;

public class StringDemo {

	public static void main(String[] args) {
		
		//new StringDemo().task1();
		//new StringDemo().task2();
		//new StringDemo().task3();
		new StringDemo().stringBufferDemo();
	}
	
	
	void stringBufferDemo()
	{
		StringBuffer sb= new StringBuffer("ABC");
		
		sb.append("XYZ");
		System.out.println(sb);
	}
	void task1()
	{
		String str = new String("Hello");
		//str.concat(" Java");
		str = str.concat(" Java");
		System.out.println(str);
		
		
		str=str.toLowerCase();
		System.out.println(str);
	}
	
	void task2()
	{
		String s1 = new String("  ABC");
		String s2 = new String("abc");
		String s3 = "ABC";
		String s4 = "ABC";

		boolean a = (s1 == s2); // false
		boolean b = (s3 == s4); // true
	
		boolean c = s1.equals(s2); //  false
		boolean d = s1.equalsIgnoreCase(s2); // true
		
	}
	
	// Spring API 
	void task3()
	{
		String s1 = "  abc  ";
		System.out.println(s1.length());
	
		s1 = s1.trim();
		System.out.println(s1.length());
		
		String s2 = "0123456789";
		s2 = s2.substring(5,8);
		System.out.println(s2);
		
		String s3 = "mike@gmail.com";
		char ch = s3.charAt(5);
		System.out.println(ch);
		
		char chArr[] = s3.toCharArray();
		// ======================================
		
		String s4 = "Hello How Are You!!";
		String arr[] = s4.split(" ");
		
		for (String str : arr) {
			System.out.println(str);
		}
		
		//============================
		
		
		
	
	}
	
	// -- Home Work ---
	void task4()
	{
		
		String s1 = "abc.xyz@gmail.com";
		
		// split on the basis of .
		
		String s2 = "Spring,Hibernate,Spring-Rest,Angular,React";
		// Split on the basis of ,
		
		String s3 = "3+2=5";
		// split on the basis of +
		
		String s4 = "mike@gmail.com";
		// split on the basis of regular exp
		// read of regular exp 
		
		
	}
	
	void task5()
	{
		
		/*
		 Input msg:- Hello dog how are you idiot
		 output:- Hello ### how are you ##### 
		 
		 * */
	}
	
}

















