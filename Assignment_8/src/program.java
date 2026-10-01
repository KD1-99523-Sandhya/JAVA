

import java.util.Scanner;


class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("ID : %-10d Name : %-15s Salary : %.2f",
				id, name, salary);
	}
}



interface Stack {

	int STACK_SIZE = 5;

	void push(Employee emp);

	Employee pop();
}



class FixedStack implements Stack {

	private Employee[] arr;
	private int top;

	public FixedStack() {
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee emp) {

		if (top == STACK_SIZE - 1) {
			System.out.println("Fixed Stack is full");
			return;
		}

		top++;
		arr[top] = emp;
	}

	@Override
	public Employee pop() {

		if (top == -1) {
			System.out.println("Fixed Stack is empty");
			return null;
		}

		Employee emp = arr[top];
		top--;

		return emp;
	}
}



class GrowableStack implements Stack {

	private Employee[] arr;
	private int top;

	public GrowableStack() {
		arr = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee emp) {

		if (top == arr.length - 1) {

			Employee[] temp = new Employee[arr.length * 2];

			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}

			arr = temp;
		}

		top++;
		arr[top] = emp;
	}

	@Override
	public Employee pop() {

		if (top == -1) {
			System.out.println("Growable Stack is empty");
			return null;
		}

		Employee emp = arr[top];
		top--;

		return emp;
	}
}



public class program {

	public static Scanner sc = new Scanner(System.in);

	public static int menuList() {

		System.out.println();
		System.out.println("0. Exit");
		System.out.println("1. Choose Fixed Stack");
		System.out.println("2. Choose Growable Stack");
		System.out.println("3. Push Data");
		System.out.println("4. Pop Data");
		System.out.print("Enter choice : ");

		return sc.nextInt();
	}

	public static Employee acceptEmployee() {

		System.out.print("Enter Employee ID : ");
		int id = sc.nextInt();

		System.out.print("Enter Employee Name : ");
		String name = sc.next();

		System.out.print("Enter Employee Salary : ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(id, name, salary);

		return emp;
	}

	public static void main(String[] args) {

		Stack stack = null;

		int choice;

		while ((choice = menuList()) != 0) {

			switch (choice) {

			case 1:

				if (stack == null) {
					stack = new FixedStack();
					System.out.println("Fixed Stack selected");
				}
				else {
					System.out.println("Stack already selected");
				}

				break;

			case 2:

				if (stack == null) {
					stack = new GrowableStack();
					System.out.println("Growable Stack selected");
				}
				else {
					System.out.println("Stack already selected");
				}

				break;

			case 3:

				if (stack != null) {

					Employee emp = program.acceptEmployee();

					stack.push(emp);
					System.out.println("Employee pushed successfully");

				}
				else {
					System.out.println("NO stack chosen !!!");
				}

				break;

			case 4:

				if (stack != null) {

					Employee emp = stack.pop();

					if (emp != null) {
						System.out.println("Popped Employee : " + emp);
					}

				}
				else {
					System.out.println("NO stack chosen !!!");
				}

				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}

		sc.close();
	}
}