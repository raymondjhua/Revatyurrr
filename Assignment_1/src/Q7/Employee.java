package Q7;

import java.util.Comparator;

public class Employee implements Comparator {
	private String name;
	private String department;
	private int age;
	
	public Employee(){
		this("", "", 0);
	}
	public Employee(String name, String department, int age){
		this.name = name;
		this.department = department;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compare(Object o1, Object o2) {
		return compare((Employee) o1, (Employee) o2);
	}
	
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().charAt(0) < e2.getName().charAt(0))
			return -1;
		else if (e1.getName().charAt(0) == e2.getName().charAt(0))
			return 0;
		else 
			return 1;
	}
}
