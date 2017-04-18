import java.util.Scanner;

public class LinkedListMain {
	private static int x;
	private static int xx;
	private static int y;
	private static String z = "";
	public static void main(String[] args) {
		LList list = new LList();

		Scanner in = new Scanner(System.in);
		
		do{
		System.out.print("Enter a number, (0 to quit): ");
		x =in.nextInt();
		xx = x;
		do{
			if(x%2==0){
				list.addAtHead("0");
			}
			else 
				list.addAtHead("1");
			
			x=x/2;
			y++;
		}while(x>=1);
		
		System.out.print("The binary number is: ");
		
		do{
		System.out.print(list.deleteAtHead());
		
		
		y--;
		}while(y>0);
		System.out.println("");
		}while(xx != 0);
//		System.out.println("Goodbye.");
	}


}
