package com.hello.reflection;

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// using class name
		String name = Employee.class.getName();
		//using object ref
		Class<? extends Employee> class1 = new Employee().getClass();
		// using forName()
		Class<?> forName = Class.forName("com.hello.reflection.Employee");
		forName.getDeclaredFields();

	}

}

class Employee{
	private int id;
	String name;
	protected int salary;
	public int age;
	
	
	Employee(){}
	Employee(int id, String name){}
	
	public void m1(){}
	private void m2(){}
	protected void m3(){}
	void m4(){}
}
