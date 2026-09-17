import java.util.Scanner;

public class FoodMenu {

	public static void main(String[] args) {
		int ch;
		double d_price=40;
		double s_price=15;
		double i_price=30;
		double w_price=20;
		double b_price=45;
		double p_price=25;
		double n_price=70;
		double soya_price=80;
		double r_price=55;		
		double totalPrice = 0;
				do {
					System.out.println("0.Exit\n1.Dosa\n2.Samosa\n3.Idli\n4.Wadapav\n5.Bhel\n6.Poha\n7.Noodles\n8.SoyaChilli\n9.Rice\n10.Generate Bill\n");
					System.out.println("Enter the choice:");
					Scanner scanner=new Scanner(System.in);
					ch=scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Quantity: ");
				 int quan=scanner.nextInt(); 
				totalPrice=totalPrice+(d_price*quan);
				break;
			case 2:
				System.out.print("Enter Quantity: ");
				 int quan2=scanner.nextInt(); 
				totalPrice=totalPrice+(s_price*quan2);
				break;
			case 3:
				System.out.print("Enter Quantity: ");
				 int quan3=scanner.nextInt(); 
				totalPrice=totalPrice+(i_price*quan3);
				break;
			case 4:
				System.out.print("Enter Quantity: ");
				 int quan4=scanner.nextInt(); 
				totalPrice=totalPrice+(w_price*quan4);
				break;
			case 5:
				System.out.print("Enter Quantity: ");
				 int quan5=scanner.nextInt(); 
				totalPrice=totalPrice+(b_price*quan5);
				break;
			case 6:
				System.out.print("Enter Quantity: ");
				 int quan6=scanner.nextInt(); 
				totalPrice=totalPrice+(p_price*quan6);
				break;
			case 7:
				System.out.print("Enter Quantity: ");
				 int quan7=scanner.nextInt(); 
				totalPrice=totalPrice+(n_price*quan7);
				break;
			case 8:
				System.out.print("Enter Quantity: ");
				 int quan8=scanner.nextInt(); 
				totalPrice=totalPrice+(soya_price*quan8);
				break;
			case 9:
				System.out.print("Enter Quantity: ");
				 int quan9=scanner.nextInt(); 
				totalPrice=totalPrice+(r_price*quan9);
				break;
			case 10:
					System.out.println("Total Bill  is: "+ totalPrice);

			default:
				break;
			}
		} while (ch!=0);

	}

}