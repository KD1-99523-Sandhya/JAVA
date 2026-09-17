import java.util.Scanner;

public class CheckDataType {

	public static void main(String[] args) {
		double n1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
	
		if(!sc.hasNextInt()) {
			if(sc.hasNextDouble()) {
			n1=sc.nextDouble();
			System.out.println("number is double");
			}
		}
		else {
			System.out.println("Number is not double");
		}
		

	}

}