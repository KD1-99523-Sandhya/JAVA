import java.util.Scanner;

public class Q1_Assignment {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Given Number:"+num);
		System.out.println("Binary equivalent:" +Integer.toBinaryString(num));
		System.out.println("Octal equivalent:" +Integer.toOctalString(num));
		System.out.println("Heaxdecimal equivalent:" +Integer.toHexString(num));	
		}
		
		
	}

