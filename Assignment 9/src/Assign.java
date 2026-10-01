import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Assign {
	static ArrayList<Student> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void accept() {
		System.out.println("Enter roll no : ");
		int roll = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("Enter marks : ");
		double marks = sc.nextDouble();
		
		Student s = new Student(roll,name,marks);
		list.add(s);
		System.out.println("Student added successfully.");
	}
	
	public static void display() {
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
	}
	
	public static void search() {
		System.out.println("Enter roll no. to search : ");
		int roll = sc.nextInt();
		 
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) {
			Student s = itr.next();
			
			if(roll == s.getRoll()) {
				System.out.println(s);
			}
		}
		System.out.println("Student not found");
	}
	
	public static void main(String[] args) {
		

	}

}
