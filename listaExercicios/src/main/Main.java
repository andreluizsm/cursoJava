package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Employee;

public class Main {
    public static void main(String[] args) {
    	
    	List<Employee> list = new ArrayList<>();
    	Scanner sc = new Scanner(System.in); 
    	
    	System.out.println("How many employees will be registered : ");
    	int size = sc.nextInt();
    	
    	for(int i = 0; i < size; i++) {
    		System.out.println();
    		System.out.println("Employee " + "#" +i + 1);
    		
    		System.out.println("Id: ");
    		int id = sc.nextInt();
    		while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
    		sc.nextLine();
    		System.out.println("Name: ");
    		String name = sc.nextLine();
    		
    		System.out.println("Salary: ");
    		double salary = sc.nextDouble();
    		
    		list.add(new Employee(id, name, salary));
    	}
    	
    	System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
    	int id = sc.nextInt();
    	
    	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    	if (emp == null) {
    		System.out.println("This id does not exist!");
    	}else {
    		System.out.println("Enter a percentage: ");
    		double percentage = sc.nextDouble();
    		emp.increaseSalary(percentage);
    	}
    	
    	System.out.println();
    	System.out.println("List of employees: ");
    	for (Employee obj : list) {
    		System.out.println(obj);
    	}
    	
    	sc.close();
        
    }

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}