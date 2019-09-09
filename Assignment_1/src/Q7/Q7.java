package Q7;
//Sort two employees based on   their   name,   department,and   age using   the Comparator interface

public class Q7{
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Employee("John", "Finance", 50);
		employees[1] = new Employee("Sam", "Research and Development", 200 );
		System.out.println("Initial order");
		for (Employee i : employees)
			System.out.println(i.getName());
		
		System.out.println("Sort by name");
		//int sortKey = compare(employees[0], employees[1]);
		for (Employee i : employees)
			System.out.println(i.getName());
/*
		System.out.println("Sort by department");
		employees = sortByDepartment(employees[0], employees[1]);

		System.out.println("Sort by age");
		employees = sortByAge(employees[0], employees[1]);
		*/
	}	
	
}
//incomplete